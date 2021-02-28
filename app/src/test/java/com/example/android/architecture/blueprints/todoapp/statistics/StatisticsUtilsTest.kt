package com.example.android.architecture.blueprints.todoapp.statistics

import com.example.android.architecture.blueprints.todoapp.data.Task
import junit.framework.Assert.assertEquals
import junit.framework.TestCase
import org.junit.Test

//TODO 1.5
class StatisticsUtilsTest{

    // Is there's no completed task and one active task,
    // then there are 100% active tasks and 0% completed tasks.
    //TODO 1.6
    @Test
    fun getActiveAndCompletedStats_noCompleted_returnsHundredZero() {

        //TODO 1.7
        // Create an active tasks (the false makes this active)
        val tasks = listOf<Task>(
                Task("title", "desc", isCompleted = false)
        )

        //TODO 1.8
        // Call our function
        val result = getActiveAndCompletedStats(tasks)

        //TODO 1.9
        // Check the result
        assertEquals(result.completedTasksPercent, 0f)
        assertEquals(result.activeTasksPercent, 100f)
    }

    // Is there's 2 completed task and 3 active tasks,
    // then there are 40% percent completed task and 60% percent active tasks.
    //TODO 1.10
    @Test
    fun getActiveAndCompletedStats_both_returnsFortySixty() {

        // Create an active tasks (the false makes this active)
        val tasks = listOf<Task>(
                Task("title", "desc", isCompleted = true),
                Task("title", "desc", isCompleted = true),
                Task("title", "desc", isCompleted = false),
                Task("title", "desc", isCompleted = false),
                Task("title", "desc", isCompleted = false)
        )

        // Call our function
        val result = getActiveAndCompletedStats(tasks)

        assertEquals(40f, result.completedTasksPercent)
        assertEquals(60f, result.activeTasksPercent)
    }
}

