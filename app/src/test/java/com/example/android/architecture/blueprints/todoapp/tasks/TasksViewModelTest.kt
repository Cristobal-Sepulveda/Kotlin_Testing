package com.example.android.architecture.blueprints.todoapp.tasks

import android.os.Build
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.android.architecture.blueprints.todoapp.Event
import com.example.android.architecture.blueprints.todoapp.MainCoroutineRule
import com.example.android.architecture.blueprints.todoapp.R
import com.example.android.architecture.blueprints.todoapp.data.Task
import com.example.android.architecture.blueprints.todoapp.data.source.FakeTestRepository
import com.example.android.architecture.blueprints.todoapp.getOrAwaitValue
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.TestCoroutineDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.setMain
import org.hamcrest.Matchers.*
import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.annotation.Config

/*//TODO 2.8
@RunWith(AndroidJUnit4::class)*/
@Config(sdk = [Build.VERSION_CODES.P])
@ExperimentalCoroutinesApi //TODO 10.2
//TODO 2.5
class TasksViewModelTest{

    //TODO 10.2
/*    val testDispatcher: TestCoroutineDispatcher = TestCoroutineDispatcher()
    @Before
    fun setupDispatcher() {
        Dispatchers.setMain(testDispatcher)
    }
    @After
    fun tearDownDispatcher() {
        Dispatchers.resetMain()
        testDispatcher.cleanupTestCoroutines()
    }*/

    //TODO 10.4
    // WITH
    @ExperimentalCoroutinesApi
    @get:Rule
    var mainCoroutineRule = MainCoroutineRule()

    //TODO 2.15
    // Subject under test
    private lateinit var tasksViewModel: TasksViewModel

    //TODO 4.9
    private lateinit var tasksRepository: FakeTestRepository
    //TODO 2.10
     @get:Rule
     var instantExecutorRule = InstantTaskExecutorRule()

    //TODO 2.15
    @Before
    fun setupViewModel() {
        //TODO 4.10
        // We initialise the tasks to 3, with one active and two completed
        tasksRepository = FakeTestRepository()
        val task1 = Task("Title1", "Description1")
        val task2 = Task("Title2", "Description2", true)
        val task3 = Task("Title3", "Description3", true)
        tasksRepository.addTasks(task1, task2, task3)

        //TODO 4.10
        tasksViewModel = TasksViewModel(tasksRepository)
    }

    @Test
    fun addNewTask_setsNewTaskEvent() {
/*
        // Given a fresh TasksViewMode
        //TODO 2.7
        val tasksViewModel = TasksViewModel(ApplicationProvider.getApplicationContext())
*/
    // When adding a new task
        tasksViewModel.addNewTask()
        //TODO 2.11
    // Then the new task event is triggered
        val value = tasksViewModel.newTaskEvent.getOrAwaitValue()
        //TODO 2.13
        assertThat(value.getContentIfNotHandled(), (not(nullValue())))
    }

    //TODO 2.14
    @Test
    fun setFilterAllTasks_tasksAddViewVisible() {
/*

        // Given a fresh ViewModel
        val tasksViewModel = TasksViewModel(ApplicationProvider.getApplicationContext())
*/

        // When the filter type is ALL_TASKS
        tasksViewModel.setFiltering(TasksFilterType.ALL_TASKS)

        // Then the "Add task" action is visible
        assertThat(tasksViewModel.tasksAddViewVisible.getOrAwaitValue(), `is`(true))
    }

    //TODO 10.1
    @Test
    fun completeTask_dataAndSnackbarUpdated() {
        // Create an active task and add it to the repository.
        val task = Task("Title", "Description")
        tasksRepository.addTasks(task)

        // Mark the task as complete task.
        tasksViewModel.completeTask(task, true)

        // Verify the task is completed.
        assertThat(tasksRepository.tasksServiceData[task.id]?.isCompleted, `is`(true))

        // Assert that the snackbar has been updated with the correct text.
        val snackbarText: Event<Int> =  tasksViewModel.snackbarText.getOrAwaitValue()
        assertThat(snackbarText.getContentIfNotHandled(), `is`(R.string.task_marked_complete))
    }
}
