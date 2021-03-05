package com.example.android.architecture.blueprints.todoapp.data.source

import androidx.lifecycle.LiveData
import com.example.android.architecture.blueprints.todoapp.data.Result
import com.example.android.architecture.blueprints.todoapp.data.Task
import java.lang.Exception

//TODO 3.1
class FakeDataSource(var tasks: MutableList<Task>? = mutableListOf()): TasksDataSource {

    //TODO 3.2
    override suspend fun saveTask(task: Task) {
        tasks?.add(task)
    }

    //TODO 3.3
    override suspend fun deleteAllTasks() {
        tasks?.clear()
    }

    //TODO 3.4
    override suspend fun getTasks(): Result<List<Task>> {
        tasks?.let{
            return Result.Success(ArrayList(it)) }
        return Result.Error(Exception("task not found"))
    }
    override fun observeTasks(): LiveData<Result<List<Task>>> {
        TODO("Not yet implemented")
    }

    override suspend fun refreshTasks() {
        TODO("Not yet implemented")
    }

    override fun observeTask(taskId: String): LiveData<Result<Task>> {
        TODO("Not yet implemented")
    }

    override suspend fun getTask(taskId: String): Result<Task> {
        TODO("Not yet implemented")
    }

    override suspend fun refreshTask(taskId: String) {
        TODO("Not yet implemented")
    }

    override suspend fun completeTask(task: Task) {
        TODO("Not yet implemented")
    }

    override suspend fun completeTask(taskId: String) {
        TODO("Not yet implemented")
    }

    override suspend fun activateTask(task: Task) {
        TODO("Not yet implemented")
    }

    override suspend fun activateTask(taskId: String) {
        TODO("Not yet implemented")
    }

    override suspend fun clearCompletedTasks() {
        TODO("Not yet implemented")
    }
    override suspend fun deleteTask(taskId: String) {
        TODO("Not yet implemented")
    }
}