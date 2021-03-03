package com.example.android.architecture.blueprints.todoapp.tasks

import android.os.Build
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.android.architecture.blueprints.todoapp.getOrAwaitValue
import org.hamcrest.Matchers.not
import org.hamcrest.Matchers.nullValue
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.annotation.Config

//TODO 2.8
@RunWith(AndroidJUnit4::class)
@Config(sdk = [Build.VERSION_CODES.P])
//TODO 2.5
class TasksViewModelTest{

    //TODO 2.10
     @get:Rule
     var instantExecutorRule = InstantTaskExecutorRule()

    @Test
    fun addNewTask_setsNewTaskEvent() {
        // Given a fresh TasksViewMode
        //TODO 2.7
        val tasksViewModel = TasksViewModel(ApplicationProvider.getApplicationContext())

    // When adding a new task
        tasksViewModel.addNewTask()
        //TODO 2.11
    // Then the new task event is triggered
        val value = tasksViewModel.newTaskEvent.getOrAwaitValue()
        //TODO 2.13
        assertThat(value.getContentIfNotHandled(), (not(nullValue())))
    }
}
