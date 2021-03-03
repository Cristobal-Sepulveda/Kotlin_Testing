________________________________________________________________________________

                            1. Looking Forward
________________________________________________________________________________

Capstone Component

  Testing is one of the areas of application development that goes
  under-appreciated and unloved… until it isn’t. Testing can enable
  you to scale your app quickly and safely while reducing the worry
  that downstream effects negatively impact the application.
  Think about your application, what common actions or functions are
  core to your application that could benefit from the assuredness
  tests can provide?

In This Lesson

  Many development firms struggle to invest in proper testing procedures.
  As a result, small changes of seemingly unrelated features can
  sometimes lead to bugs or errors in other core features of the application.
  Think about your overall experience with applications and answer
  the following:

    * Have you ever been frustrated that a key feature didn’t work
      after an update?

    * Did it work before?

    * What kind of test might have prevented this bug from being introduced?

    * Do you think the bug is limited to you or your phone?

    * Would this bug prevent new users from appreciating the app,
      potentially even leading to abandon or uninstall?

    * What was introduced into the app when this feature broke?
      Can you correlate the two?

________________________________________________________________________________

                            2. Welcome to Testing
________________________________________________________________________________

________________________________________________________________________________

                            3. Testing Lesson Map
________________________________________________________________________________

Beginner Resources

    * This lesson is in Kotlin. To learn more about Kotlin check out the Kotlin
      Programmer's Bootcamp.

    * If you're new to developing Android applications, check out Developing
      Android Apps in Kotlin. This course covers all the concepts you need to
      know for this lesson.

    * You can also check out the Android Room with a View Codelab, the
      Navigation Codelab, Coroutines codelab. and the Android Data Binding
      Codelab, These cover some of the same material, but in a text
      tutorial format.

Table of Contents

Lesson 2.1 Testing Basics

  Part 1: Read and Write Basic Tests

    * Download the App - Download the Application (Code Checkpoint)

    * Default Test Setup - Explore the default testing setup for an Android
      Studio project

    * Run You First Test - Running and understanding test results in Android
      Studio

    * androidTest vs. Test - The difference between the androidTest and test
      folders (source sets); introduction to local and integration tests.

    * Write Your First Test - Write a simple test from start to finish

    * Make Your Tests Readable - Three strategies for readable tests

  Part 2: Testing and Architecture

    * Planning a Testing Strategy - Unit, integration and end to end tests
      and how testing relates to architecture

    * App Tour - Tour of the app code

  Part 3: Basic ViewModel and LiveData Tests

    * Setup a ViewModel Test - Create a ViewModel unit test for AndroidViewModel

    * AndroidX Test - An introduction to AndroidX Test

    * LiveData Testing Basics - How to test LiveData

    * Write Your Own ViewModel Test - Write a ViewModel test on your own

Lesson 2.2 Intro to Test Doubles and Dependency Injection

  Part 4: Test Doubles and Dependency Injection

    * Test Doubles - An introduction to Test Doubles, including a Fake

    * Make a FakeDataSource - Create a Fake data source (Code Checkpoint)

    * Dependency Injection - An introduction to Dependency Injection

    * Test Repository with Constructor Dependency Injection and DI - Use
      constructor dependency injection to swap in your test double

  Part 5: Test Doubles and Dependency Injection for ViewModel

    * Where else to Use Dependency Injection? - Answer questions to assess
      how to set up dependency injection

    * Set Up a Fake Repository - Create a fake repository

    * Use the Fake Repository inside a ViewModel - Use constructor
      dependency injection with ViewModels

  Part 6: Writing ViewModel and Fragment Integration Tests

    * FragmentScenario - An introduction to FragmentScenario to create
      and control Fragments in tests

    * Launch a Fragment from a Test - Launch a fragment using FragmentScenario

    * Service Locators - What a Service Locator is, how to use it
      and how to create one

    * Use a Service Locator - Use a Service Locator in your main code

    * Use your Service Locator in your Tests - Use a Service Locator in
      your tests

    * Using Espresso to Test a Fragment - An introduction to the Espresso
      UI testing framework and finish writing your fragment view model
      integration test

    * Espresso Write Your Own Test - Practice writing your own fragment
      integration test with Espresso

  Part 7: Mocking

    * Introduction to Mocks - An introduction to Mocks, when to use them
      instead of Fakes and Mocking with Mockito

    * Using Mockito to Write Navigation Tests - Write a test for the
      Navigation Component using Mockito

Lesson 2.3 Survey of Advanced Testing Topics

  Part 8: Testing Coroutines

    * Testing Asynchronous Code - An introduction to the theory and
      challenges of testing asynchronous code on Android

    * Review of Testing Coroutines - Review of coroutines testing
      strategies covered up to this point

    * viewModelScope and TestCoroutineDispatcher - Test coroutines in
      a ViewModel and using TestCorotuineDispatcher (Code Checkpoint)

    * MainCoroutineRule and Injecting Dispatchers - Use best practices
      and strategies for removing boilerplate when testing coroutines

    * StatisticsViewModelTest - Setup StatisticsViewModel for testing

    * Testing Coroutine Timing - Write a test where you pause and resume
      coroutine execution to test a loading indicator

  Part 9: Error Handling

    * Testing Error Handling - Write a test that makes sure errors
      are handled correctly

  Part 10: Testing your Data Layer

    * Testing Room - Write a tests for a Room DAO

    * Testing Local Data Source - Write tests for a local data source

  Part 11: Testing Databinding

    * Idling Resources and End-to-End Testing - Introduces
      EspressoIdlingResources and when you use them

    * Counting Idling Resource - Setup your first end to end test. Setup your
      application code to use CountingIldingResource so Espresso can test
      code that involves long running operation (like network calls)

    * Databinding Idling Resource - Setup an Espresso test for code that
      uses the DataBinding library

    * Using Idling Resources - Write tests that use EspressoIdlingResource

  Part 12: Testing Global Navigation

    * Testing Global App Navigation - Write End to End tests that include
      Global App Navigation (Code Checkpoint)

________________________________________________________________________________

                          4. Code Checkpoint: Download the App
________________________________________________________________________________

Step 1: Download the Code

  To get started, download the code here, download a zip of the
  starter code here, OR you can clone the Github repository for the code:

    $ git clone https://github.com/udacity/android-testing.git
    $ cd android-architecture
    $ git checkout starter_code

  This TO-DO app starter code has the same testing set-up (folders, library
  dependencies and sample tests) as a brand new project created with
  Android Studio. All of the tests and test configuration will be covered
  in these lessons so that you can apply the same testing practices to your
  own Android applications.

https://video.udacity-data.com/topher/2019/October/5d93729a_3.downloadtheapp/3.downloadtheapp.png


Step 2: Run the Sample App

  Once you've downloaded the TO-DO Tasks app, open it in Android Studio
  and run it. It should compile. Explore the app by doing the following:

    1. Create a new task with the plus floating action button. Enter a
       title first, then enter additional information about the task.
       Scroll to see or edit the whole task before saving it.

    2. In the list of tasks, click on the title of the task you just completed
       and look at the detail screen for that task to see the rest of the
       description.

    3. In the list or on the detail screen, check the checkbox of that task
       to set its' status to "Completed".

    4. Go back to the tasks screen, open the filter menu, and filter the
       tasks by "Active" and "Completed" status.

    5. Open the navigation drawer and click "Statistics".

    6. Go back to the overview screen and from the navigation drawer menu,
       select "Clear completed" to delete all tasks with the "Completed" status.

Good work! You've seen how to operate the TO-DO Tasks app. You'll
explore the testing code next.

________________________________________________________________________________

                          5. Default Test Setup
________________________________________________________________________________

Dependencies in Gradle are scoped by source set:

    * implementation - for the main source set

    * testImplementation - for the test source set

    * androidTestImplementation - for the androidTest source set

`TODO 1.1`
    // Dependencies for local unit tests
testImplementation "junit:junit:$junitVersion"

// AndroidX Test - Instrumented testing
androidTestImplementation "androidx.test.ext:junit:$androidXTestExtKotlinRunnerVersion"
androidTestImplementation "androidx.test.espresso:espresso-core:$espressoVersion"

  This is done using gradle configurations.
https://docs.gradle.org/current/userguide/managing_dependency_configurations.html

________________________________________________________________________________

                          6. Run Your First Test
________________________________________________________________________________

You can learn more about Junit4 at the official documentation website.
https://junit.org/junit4/

Step 1: Run A Local Test

    1. Open up your project pane and find the androidTest and test folders.

  Okay, time to run your first test.

    2. Open the test folder until you find the ExampleUnitTest.kt file.

    3. Right-click on it and select Run ExampleUnitTest.

  You should see the following output in the Run window at the bottom of the screen:

https://video.udacity-data.com/topher/2019/October/5d93729c_5.runyourfirsttest3/5.runyourfirsttest3.png

Step 2: Make the Test Fail

  Let's quickly see what a failed test looks like.

    `TODO 1.2`
    1. Copy over the the statement assertEquals(3, 1 + 1):

          ExampleUnitTest.kt
          @RunWith(AndroidJUnit4::class)
          class ExampleUnitTest {

           // Each test is annotated with @Test (this is a Junit annotation)
           @Test
           fun addition_isCorrect() {
               assertEquals(4, 2 + 2)
    `TODO 1.3`
               assertEquals(3, 1 + 1) // This should fail
           }
        }

  This is checking that 3 is equal to 1 + 1. Because this is not true, this should fail.

    2. Run the test.

  You should see an x next to the last test:

https://video.udacity-data.com/topher/2019/October/5d93729d_5.runyourfirsttest4/5.runyourfirsttest4.png


Quiz
Look at the code and answer the following questions.

1.
2. class ExampleMultiplicationTest {
3.
4.    fun check(){
5.       var result = MathUtil.multiply(2,3)
6.       assertEquals(result, 6)
7.    }
8. }

QUESTION 1 OF 2
Assuming this is in the test source set, will check() run as a test?
No, Because you need to add an @Test annotation on line 3

QUESTION 2 OF 2
There is an issue with line 6, what is it?
You need to switch the order of the two parameters, the 6 must be the expected
value






________________________________________________________________________________

                          7. androidTest vs. Test
________________________________________________________________________________

Instrumented tests are in the androidTest source set.

    1. Open up the androidTest source set

    2. Run the test called ExampleInstrumentedTest

  Unlike the local test, the test runs on a device (in the example below an
  emulated Pixel 2 phone):

https://video.udacity-data.com/topher/2019/October/5d93729d_6.androidtestvtest/6.androidtestvtest.png

  If you have a device attached or an emulator running, you should actually
  see the test run on the emulator.

Quiz
Below is the 'Welcome to Testing' Video posted again for your convenience to
answer a question in the following quiz.


QUESTION 1 OF 2
In the Welcome to Testing video above, there was an example of a test running.
Do you know which source set that test was in?

R: androidTest

Correct! Because the code ran on an Android emulator, you know this test is an
instrumented test run from the androidTest source set.


Below there is an image that you will answer a question about in the following quiz.
https://video.udacity-data.com/topher/2019/October/5d9f5f6e_6.androidtestvtestquiz/6.androidtestvtestquiz.png

QUESTION 2 OF 2
From the image above of the run configuration dialog, can you identify which
test will be run locally?

R: TasksViewModelTest

Yes! You can tell by the symbol used in the configuration (two arrows).

________________________________________________________________________________

                          8. Write Your First Tests
________________________________________________________________________________


Now it is is your turn to write your first tests.

  Step 1: Create a Test Class

    1. Right click getActiveAndCompletedStats and select Generate then Test.

https://video.udacity-data.com/topher/2019/October/5d9e003f_7.writeyourfirsttest/7.writeyourfirsttest.png

  Then Create Test dialog opens.

    2. Change the Class name to StatisticsUtilsTest.

    3. Keep the rest of the defaults and press OK.

  Then Choose Destination Directory dialog opens.

    4. Select the test directory (not androidTest) because you'll be writing
       local tests. Press OK.

  Step 2: Write Your First Test

              StatisticsUtilsTest.kt
              `TODO 1.6`
              class StatisticsUtilsTest {

                  @Test
                  fun getActiveAndCompletedStats_noCompleted_returnsHundredZero() {
                      `TODO 1.7`
                      // Create an active tasks (the false makes this active)
                      val tasks = listOf<Task>(
                          Task("title", "desc", isCompleted = false)
                      )
                      `TODO 1.8`
                      // Call our function
                      val result = getActiveAndCompletedStats(tasks)

                      `TODO 1.9`
                      // Check the result
                      assertEquals(result.completedTasksPercent, 0f)
                      assertEquals(result.activeTasksPercent, 100f)
                  }
              }

    1. Go ahead and run the test (Right click StatisticsUtilTest and select Run).


Step 3: Write More Tests Yourself

  Using the test above and the video, write the following tests:

    1. Start by writing test for when you have a normal task list:

      * If there is one completed task and no active tasks, the activeTasks
        percentage should be 0f, the completed tasks percentage should be 100f.

      * If there are two completed tests and three active test, the completed
        percentage should be 40f and the active percentage should be 60f.

        `TODO 1.10`
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
________________________________________________________________________________

                      9. Write Your First Test Continued
________________________________________________________________________________

Step 1: Practice Test Driven Development (TDD)

  Now you can do the short Test Driven Development (TDD) exercise
  shown in the video:

  1. Write some tests for the buggy edge cases; follow TDD as shown in the video:

`TODO 2.1`
    * If there is an empty list (emptyList()), then both percentages should be 0f.

`TODO 2.2`
    * If there was an error loading tasks, the list will be null, then both percentages should be 0f.

  2. Confirm these tests fail.

  When following TDD, you'll write the tests first and then update the actual code.

`TODO 2.3`
  3. Update getActiveAndCompletedStats to remove the bug where the wrong values
     are returned on an empty list and error.

  4. Confirm your tests pass.

Test Driven Development

  To learn more about Test Driven Development in Android, you can watch
  Test-Driven Development on Android with the Android Testing Support
  Library (Google I/O '17)
https://www.youtube.com/watch?t=222&v=pK7W5npkhho&feature=youtu.be&ab_channel=AndroidDevelopers
  (note the Android Testing Support Library
  has been replaced by AndroidX Test which you'll learn about later).
  https://developer.android.com/training/testing/set-up-project

________________________________________________________________________________

                      10. Solution: Write Your First Test
________________________________________________________________________________


Solution
Here are the final tests:
StatisticsUtilsTest.kt

class StatisticsUtilsTest {

    @Test
    fun getActiveAndCompletedStats_noCompleted_returnsHundredZero {
        val tasks = listOf(
            Task("title", "desc", isCompleted = false)
        )
        // When the list of tasks is computed with an active task
        val result = getActiveAndCompletedStats(tasks)

        // Then the percentages are 100 and 0
        assertThat(result.activeTasksPercent, `is`(100f))
        assertThat(result.completedTasksPercent, `is`(0f))
    }

    @Test
    fun getActiveAndCompletedStats_noActive_returnsZeroHundred() {
        val tasks = listOf(
            Task("title", "desc", isCompleted = true)
        )
        // When the list of tasks is computed with a completed task
        val result = getActiveAndCompletedStats(tasks)

        // Then the percentages are 0 and 100
        assertThat(result.activeTasksPercent, `is`(0f))
        assertThat(result.completedTasksPercent, `is`(100f))
    }

    @Test
    fun getActiveAndCompletedStats_both_returnsFortySixty() {
        // Given 3 completed tasks and 2 active tasks
        val tasks = listOf(
            Task("title", "desc", isCompleted = true),
            Task("title", "desc", isCompleted = true),
            Task("title", "desc", isCompleted = true),
            Task("title", "desc", isCompleted = false),
            Task("title", "desc", isCompleted = false)
        )
        // When the list of tasks is computed
        val result = getActiveAndCompletedStats(tasks)

        // Then the result is 40-60
        assertThat(result.activeTasksPercent, `is`(40f))
        assertThat(result.completedTasksPercent, `is`(60f))
    }

    @Test
    fun getActiveAndCompletedStats_error_returnsZeros() {
        // When there's an error loading stats
        val result = getActiveAndCompletedStats(null)

        // Both active and completed tasks are 0
        assertThat(result.activeTasksPercent, `is`(0f))
        assertThat(result.completedTasksPercent, `is`(0f))
    }

    @Test
    fun getActiveAndCompletedStats_empty_returnsZeros() {
        // When there are no tasks
        val result = getActiveAndCompletedStats(emptyList())

        // Both active and completed tasks are 0
        assertThat(result.activeTasksPercent, `is`(0f))
        assertThat(result.completedTasksPercent, `is`(0f))
    }
}
Here is the final getActiveAndCompletedStats with the bug removed:
StatisticsUtils.kt

internal fun getActiveAndCompletedStats(tasks: List<Task>?): StatsResult {

    return if (tasks == null || tasks.isEmpty()) {
        StatsResult(0f, 0f)
    } else {
        val totalTasks = tasks.size
        val numberOfActiveTasks = tasks.count { it.isActive }
        StatsResult(
            activeTasksPercent = 100f * numberOfActiveTasks / tasks.size,
            completedTasksPercent = 100f * (totalTasks - numberOfActiveTasks) / tasks.size
        )
    }
}

________________________________________________________________________________

                      11. Make Your Tests Readable
________________________________________________________________________________

Assertion Frameworks:
  Hamcrest
  http://hamcrest.org/
  Truth Library
  https://truth.dev/

  You'll be using Hamcrest in this lesson to write assertions.

`TODO 2.3`
Step 1: Add the Hamcrest Dependency

  1. Add the dependency.

              app/build.gradle

              dependencies {
                  // Other dependencies
                  testImplementation "org.hamcrest:hamcrest-all:$hamcrestVersion"
              }

`TODO 2.4`
Step 2: Update your tests so that all of your assertions use Hamcrest.

  1. Update your tests, using the code below as an example.

StatisticsUtilsTest.kt

              assertEquals(result.completedTasksPercent, 0f)

              // Becomes

              assertThat(result.completedTasksPercent, `is`(0f))

________________________________________________________________________________

                    12. Planning a Testing Strategy
________________________________________________________________________________

Check out the Fundamentals of Testing in the Android Developer documentation
for a deeper dive into these concepts and how they map to Android.
https://developer.android.com/training/testing/fundamentals

________________________________________________________________________________

                              13. App Tour
________________________________________________________________________________

For more information go to Developing Android Apps with Kotlin Course's Lesson 5: App Architecture (UI Layer) - Concept 18. Exercise: Add End Game Event.
https://classroom.udacity.com/courses/ud9012

________________________________________________________________________________

                          14. Setup a ViewModel Test
________________________________________________________________________________

As you just saw in the video, you'll start writing a test for the addNewTask
method in the TasksViewModel:

  TasksViewModel.kt
            fun addNewTask() {
               _newTaskEvent.value = Event(Unit)
            }

Step 1: Make A TaskViewModelTest class

  Following the same steps you did for StatisticsUtilTest, create a
  test file for TasksViewModelTest:

    1. Open up the class you wish to test, in the tasks package, TasksViewModel.

    2. Right click on the class name TasksViewModel -> Generate -> Test.

    3. On the Create Test screen, click OK to accept (no need to change any
       of the default settings).

    4. On the Choose Destination Directory dialog, choose the test directory.

`TODO 2.5`
Step 2: Start Writing the Test

    5. Create a new test called addNewTask_setsNewTaskEvent:

  TasksViewModelTest.kt
            class TasksViewModelTest {

                @Test
                fun addNewTask_setsNewTaskEvent() {

                    // Given a fresh TasksViewModel


                    // When adding a new task


                    // Then the new task event is triggered

                }

            }

`TODO 2.6`
Step 3: Use AndroidX Test to get a simulated Android Context

    1. Add the AndroidX test dependencies.
    https://developer.android.com/training/testing/set-up-project
    2. Add the Robolectric dependency.
    http://robolectric.org/
  app/build.gradle

            dependencies {
                // Other dependencies

                // AndroidX Test - JVM testing
                testImplementation "androidx.test:core-ktx:$androidXTestCoreVersion"
            testImplementation "org.robolectric:robolectric:$robolectricVersion"
            "androidx.test.ext:junit-ktx:$androidXTestExtKotlinRunnerVersion"
            }
`TODO 2.7`
    3. Create a TasksViewModel using ApplicationProvider.getApplicationContext() from the AndroidX test library:

  TasksViewModelTest.kt
            @Test
            fun addNewTask_setsNewTaskEvent() {

                // Given a fresh ViewModel
                val tasksViewModel = TasksViewModel(ApplicationProvider.getApplicationContext())

                // When adding a new task
                tasksViewModel.addNewTask()

                // Then the new task event is triggered
                // TODO test LiveData
            }
`TODO 2.8`
    4. Add the AndoirdJUnit4 test runner:

TasksViewModelTest.kt
            @RunWith(AndroidJUnit4::class)
            class TasksViewModelTest {

                @Test
                fun addNewTask_setsNewTaskEvent() {

                    // Given a fresh ViewModel
                    val tasksViewModel = TasksViewModel(ApplicationProvider.getApplicationContext())

                    // When adding a new task
                    tasksViewModel.addNewTask()

                    // Then the new task event is triggered
                    // TODO test LiveData
                }
            }

    5. Run your TasksViewModelTest. It should pass. In the output, you'll see Robolectric is running your tests:

https://video.udacity-data.com/topher/2019/October/5da0c6d2_3.setupaviewmodeltest/3.setupaviewmodeltest.png

________________________________________________________________________________

                          15. AndroidX Test
________________________________________________________________________________

About The Robolectric Errors

  Error 1: No such manifest file: ./AndroidManifest.xml

    You can fix the No such manifest file: ./AndroidManifest.xml error, by
    updating your gradle file.

`TODO 2.9`
    1. Add the following line in your gradle to so that the correct
       android manifest is used:

app/build.gradle

    // Always show the result of every unit test when running via
       command line, even if it passes.

          testOptions.unitTests {
              includeAndroidResources = true

              // ...
          }

    The includeAndroidResources option allows you to access
    android resources in your unit tests, including your AndroidManifest file.

  Error 2: Android SDK 10000

  The warning about the Android SDK 10000 is more complicated - running
  tests on Android Q requires Java 9. Instead of trying to configure
  Android Studio to use Java 9, we're keeping our target and compile
  SDK at 28.

https://github.com/robolectric/robolectric/releases/tag/robolectric-4.3

________________________________________________________________________________

                      16. LiveData Testing Basics
________________________________________________________________________________

In this step, you'll finish your addNewTask_setsNewTaskEvent() test.

  Step 1: Add InstantTaskExecutor

    1. Add the gradle dependency.

    app/build.gradle
            testImplementation "androidx.arch.core:core-testing:$archTestingVersion"

    2. Open TasksViewModelTest.kt.

    3. Add the InstantTaskExecutorRule inside the TasksViewModelTest class:
`TODO 2.11`
  TasksViewModelTest.kt
            class TasksViewModelTest {
                @get:Rule
                var instantExecutorRule = InstantTaskExecutorRule()

                // Other code…
            }

  Step 2: Add the LiveDataTestUtil.kt Class

    You'll not create the LiveDataTestUtil class so you can use the
    getOrAwaitValue Kotlin extension function.
    https://kotlinlang.org/docs/extensions.html

    1. Make a new Kotlin file called LiveDataTestUtil.kt in your test source set:

https://video.udacity-data.com/topher/2019/October/5da0c6d3_5.livedatatestingbasics/5.livedatatestingbasics.png
`TODO 2.12`
    2. Copy and paste this code there:

LiveDataTestUtil.kt
            import androidx.annotation.VisibleForTesting
            import androidx.lifecycle.LiveData
            import androidx.lifecycle.Observer
            import java.util.concurrent.CountDownLatch
            import java.util.concurrent.TimeUnit
            import java.util.concurrent.TimeoutException

              @VisibleForTesting(otherwise = VisibleForTesting.NONE)
              fun <T> LiveData<T>.getOrAwaitValue(
                  time: Long = 2,
                  timeUnit: TimeUnit = TimeUnit.SECONDS,
                  afterObserve: () -> Unit = {}
              ): T {
                  var data: T? = null
                  val latch = CountDownLatch(1)
                  val observer = object : Observer<T> {
                      override fun onChanged(o: T?) {
                          data = o
                          latch.countDown()
                          this@getOrAwaitValue.removeObserver(this)
                      }
                  }
                  this.observeForever(observer)

                  try {
                      afterObserve.invoke()

                      // Don't wait indefinitely if the LiveData is not set.
                      if (!latch.await(time, timeUnit)) {
                          throw TimeoutException("LiveData value was never set.")
                      }

                  } finally {
                      this.removeObserver(observer)
                  }

                  @Suppress("UNCHECKED_CAST")
                  return data as T
              }
  For a full explanation of what this class, check out this blog post.
https://medium.com/androiddevelopers/unit-testing-livedata-and-other-common-observability-problems-bb477262eb04
  As you write your own tests that test LiveData, you can similarly copy
  and use this class in your code.

  Step 2: Use getOrAwaitValue to Write the Assertion

  Let's use the getOrAwaitValue method and write an assert statement that
  checks that the newTaskEvent was triggered:

    1. Open TaskViewModelTest.kt.

    2. Get the LiveData value for newTaskEvent using getOrAwaitValue:

TasksViewModelTest.kt

              val value = tasksViewModel.newTaskEvent.getOrAwaitValue()

`TODO 2.13`
    3. Assert that the value is not null:

  TasksViewModelTest.kt
            assertThat(value.getContentIfNotHandled(), (not(nullValue())))

The complete test should look like this:

TasksViewModelTest.kt
            @Test
            fun addNewTask_setsNewTaskEvent() {

                // Given a fresh ViewModel
                val tasksViewModel = TasksViewModel(ApplicationProvider.getApplicationContext())

                // When adding a new task
                tasksViewModel.addNewTask()

                // Then the new task event is triggered
                val value = tasksViewModel.newTaskEvent.getOrAwaitValue()
                assertThat(
                    value.getContentIfNotHandled(), (not(nullValue()))
                )
            }

    4. Run your code and watch the test pass!

________________________________________________________________________________

                    17. Write Your Own ViewModel Test
________________________________________________________________________________

Now that you've seen how to write a test, write one on your own!

  In this step, using the skills you've learned, you'll practice writing another TasksViewModel test.

Step 1: Write your own ViewModel test

  You'll write getTasksAddViewVisible(). This test should check that
  if you've set your filter type to show all tasks, that the Add task
  button is visible.

    1. Using for addNewTask_setsNewTaskEvent() for reference, write a test in TasksViewModelTest called setFilterAllTasks_tasksAddViewVisible() that:

      * Sets the filtering mode to ALL_TASKS

      * Assets that the tasksAddViewVisible LiveData is true

Here's some code you can use to get started:

  TasksViewModelTest
            @Test
            fun setFilterAllTasks_tasksAddViewVisible() {

                // Given a fresh ViewModel

                // When the filter type is ALL_TASKS

                // Then the "Add task" action is visible

            }
Note:

    * The TasksFilterType enum for all tasks is ALL_TASKS

    * The visibility of the button to add a task is controlled by the LiveData tasksAddViewVisible.

    2. Once you're done, run your test.

________________________________________________________________________________

                18. Solution: Write Your Own ViewModel Test
________________________________________________________________________________

If you want to take a look at the solution up to this point, you can
check out this Github repo. You can compare the starter code to where
the code is now here.
https://github.com/udacity/android-testing/tree/end_codelab_1

  Step 1: Compare your test to the solution
`TODO 2.14`
    1. Compare your solution versus the solution below:

    TasksViewModelTest
            @Test
            fun setFilterAllTasks_tasksAddViewVisible() {

                // Given a fresh ViewModel
                val tasksViewModel = TasksViewModel(ApplicationProvider.getApplicationContext())

                // When the filter type is ALL_TASKS
                tasksViewModel.setFiltering(TasksFilterType.ALL_TASKS)

                // Then the "Add task" action is visible
                assertThat(tasksViewModel.tasksAddViewVisible.getOrAwaitValue(), `is`(true))
            }

Notice:

    * You create your tasksViewModel using the same AndroidX ApplicationProvider.getApplicationContext() statement

    * You call the setFiltering method, passing in the ALL_TASKS
      filter type enum

    * You check that the tasksAddViewVisible is true, using the
      getOrAwaitNextValue method

`TODO 2.15`
  Step 2: Add a @Before rule

  Notice how at the start of both of your tests, you define a TasksViewModel:

    TasksViewModelTest
                // Given a fresh ViewModel
                val tasksViewModel = TasksViewModel(ApplicationProvider.getApplicationContext())

  When you have repeated setup code like this shared between all tests,
  you can use the @Before annotation to create a setup method and remove
  repeated code. Since all of these tests are going to test the
  TasksViewModel and will need a view model, it's safe to move
  this code to a @Before block.

    1. Create a lateinit instance variable called tasksViewModel

    2. Create a method called setupViewModel

    3. Annotate it with @Before

    4. Move the view model instantiation code to setupViewModel:

  TasksViewModelTest
              // Subject under test
              private lateinit var tasksViewModel: TasksViewModel

              @Before
              fun setupViewModel() {
                  tasksViewModel = TasksViewModel(ApplicationProvider.getApplicationContext())
              }

    5. Run your code!

Warning

  Do not do the following, do not initialize the tasksViewModel with
  its definition:

                val tasksViewModel = TasksViewModel(ApplicationProvider.getApplicationContext())

  This will cause the same instance to be used for all tests. This is
  something you should avoid because each test should have a fresh
  instance of the subject under test (the ViewModel in this case).

  Your final code for TasksViewModelTest should look like:

    TasksViewModelTest
            @RunWith(AndroidJUnit4::class)
            class TasksViewModelTest {

                // Subject under test
                private lateinit var tasksViewModel: TasksViewModel

                // Executes each task synchronously using Architecture Components.
                @get:Rule
                var instantExecutorRule = InstantTaskExecutorRule()

                @Before
                fun setupViewModel() {
                    tasksViewModel = TasksViewModel(ApplicationProvider.getApplicationContext())
                }


                @Test
                fun addNewTask_setsNewTaskEvent() {

                    // When adding a new task
                    tasksViewModel.addNewTask()

                    // Then the new task event is triggered
                    val value = tasksViewModel.newTaskEvent.awaitNextValue()
                    assertThat(
                        value?.getContentIfNotHandled(), (not(nullValue()))
                    )
                }

                @Test
                fun getTasksAddViewVisible() {

                    // When the filter type is ALL_TASKS
                    tasksViewModel.setFiltering(TasksFilterType.ALL_TASKS)

                    // Then the "Add task" action is visible
                    assertThat(tasksViewModel.tasksAddViewVisible.awaitNextValue(), `is`(true))
                }

            }

________________________________________________________________________________
