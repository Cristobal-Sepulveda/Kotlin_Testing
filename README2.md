

                          CODELAB: PART 1
                          TESTING: BASICS
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



































































































































































































________________________________________________________________________________
                          CODELAB: PART 2
          TESTING: Intro to Test Doubles & Dependency Injection
________________________________________________________________________________

                          1. Test Doubles
________________________________________________________________________________

Test Doubles

  Fake
        A test double that has a "working" implementation of the class, but it's implemented in a way that makes it good for tests but unsuitable
      for production

  Mock
	      A test double that tracks which of its methods were called. It then
        passes or fails a test depending on whether it's methods were called     correctly.

  Stub
	      A test double that includes no logic and only returns what you
        program it to return. A StubTaskRepository could be programmed
        to return certain combinations of tasks from getTasks for example.

  Dummy
        A test double that is passed around but not used, such as if you just need to provide it as a parameter. If you had a DummyTaskRepository, it would just implement the TaskRepository with no code in any of the methods.

  Spy
        A test double which also keeps tracks of some additional
        information; for example, if you made a SpyTaskRepository,
        it might keep track of the number of times the addTask
        method was called.

For more information on test doubles, check out this article.
https://testing.googleblog.com/2013/07/testing-on-toilet-know-your-test-doubles.html

The documentation has some great tips about using test doubles in Android.
https://developer.android.com/training/testing/fundamentals#test-doubles
________________________________________________________________________________

              2. Code Checkpoint: Make a FakeDataSource
________________________________________________________________________________

  In this step, you're going to create a FakeDataSource test double.
  This will be so that we can properly unit test DefaultTasksRepository.

Optional Step: Download the Code (Code Checkpoint)

  If you haven't been following along or want to download the code up to
  this point, you can do so now. Download the code here, download a zip
  of the code here, OR you can clone the Github repository for the code:

          $ git clone https://github.com/udacity/android-testing.git
          $ cd android-architecture
          $ git checkout end_codelab_1

Step 1: Create the FakeDataSource Class

  In this step you are going to create a class FakeDataSouce, which will
  be a test double of a LocalDataSource and RemoteDataSource.

    1. In the test source set, right click select New -> Package.

    2. Make a data package with a source package inside.

    3. Create a new class called FakeDataSource in the data/source package:

https://video.udacity-data.com/topher/2019/October/5da0c6d3_9.makeafakedatasource1/9.makeafakedatasource1.png

`TODO 3.1`
Step 2: Implement DataSource interface

    1. Make a FakeDataSource class that implements TasksDataSource:

FakeDataSource.kt
              class FakeDataSource : TasksDataSource {

              }

  Android Studio will complain that you haven't implemented required method for TasksDataSource.

    2. Use the Quick-fix menu and select Implement members.

https://video.udacity-data.com/topher/2019/October/5da0c6d3_9.makeafakedatasource2/9.makeafakedatasource2.png

    3. Select all of the methods and press OK:

https://video.udacity-data.com/topher/2019/October/5da0c6d4_9.makeafakedatasource3/9.makeafakedatasource3.png

Step 3: Implement the getTasks method in FakeDataSource

  Start by writing fake version of these methods:

`TODO 3.2`
    * Write getTasks: If tasks isn't null, you should return a
      Success result. If tasks is null, then you should return an Error result.

`TODO 3.3`
    * Write deleteAllTasks: clear the mutable tasks list.

`TODO 3.4`
    * Write saveTask: add the task to the list.

  Here's the final code for these methods:

  FakeDataSource.kt
              override suspend fun getTasks(): Result<List<Task>> {
                  tasks?.let { return Success(ArrayList(it)) }
                  return Error(
                      Exception("Tasks not found")
                  )
              }


              override suspend fun deleteAllTasks() {
                  tasks?.clear()
              }

              override suspend fun saveTask(task: Task) {
                  tasks?.add(task)
              }

  This is similar to how the actual local and remote data sources work. You'll implement the rest of this class later, but let's write a test!

________________________________________________________________________________

                          3. Dependency Injection (DI)
________________________________________________________________________________

Reference Documentation
Dagger 2 Codelab
https://developer.android.com/codelabs/android-dagger
Dependency Injection Documentation
https://developer.android.com/training/dependency-injection

________________________________________________________________________________

          4. Test Repository with Constructor Dependency Injection and DI
________________________________________________________________________________


  In this step you'll implement Constructor Dependency Injection.
  Constructor dependency injection allows you to swap in the test
  double by passing it into the constructor.

Step 1: Use Constructor Dependency Injection in DefaultTasksRepository

`TODO 3.5`
    1. Change the DefaultTaskRepository's constructor from taking in an
       Application to taking in both data sources and the coroutine dispatcher :

  DefaultTasksRepository.kt
              // REPLACE
              class DefaultTasksRepository private constructor(
                application: Application) { // Rest of class }
              // WITH
              class DefaultTasksRepository(
                  private val tasksRemoteDataSource: TasksDataSource,
                  private val tasksLocalDataSource: TasksDataSource,
                  private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO) { // Rest of class }
`TODO 3.6`
    2. Because we passed the dependencies in, remove the init method. You no longer need to create the dependencies.

    3. Also delete the old instance variables. You're defining
       them in the constructor:

  DefaultTasksRepository.kt
              // Delete these old variables
              private val tasksRemoteDataSource: TasksDataSource
              private val tasksLocalDataSource: TasksDataSource
              private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO

`TODO 3.7`
    4. Finally, update the getRepository method to use the new constructor:

  DefaultTasksRepository.kt
              companion object {
                  @Volatile
                  private var INSTANCE: DefaultTasksRepository? = null

                  fun getRepository(app: Application): DefaultTasksRepository {
                      return INSTANCE ?: synchronized(this) {
                          val database = Room.databaseBuilder(app,
                              ToDoDatabase::class.java, "Tasks.db")
                              .build()
                          DefaultTasksRepository(TasksRemoteDataSource, TasksLocalDataSource(database.taskDao())).also {
                              INSTANCE = it
                          }
                      }
                  }
              }

    You are now using constructor dependency injection!

Step 2: Use your FakeDataSource in your tests

  Now that your code is using constructor dependency injection, you can
  use your fake data source to test your DefaultTasksRepository.

`TODO 3.8`
    1. Right click on the DefaultTasksRepository class name and select
       Generate then Test.

    2. Follow the prompts to create DefaultTasksRepositoryTest in the
       test source set.

`TODO 3.9`
    3. At the top of your new DefaultTasksRepositoryTest class, add these
       member variables to represent the data in your fake data sources:

            DefaultTasksRepositoryTest.kt
                private val task1 = Task("Title1", "Description1")
                private val task2 = Task("Title2", "Description2")
                private val task3 = Task("Title3", "Description3")
                private val remoteTasks = listOf(task1, task2).sortedBy { it.id }
                private val localTasks = listOf(task3).sortedBy { it.id }
                private val newTasks = listOf(task3).sortedBy { it.id }
`TODO 3.10`
    4. Also create three variables - two FakeDataSource member
       variables (one for each data source for your repository) and a
       variable for the DefaultTasksRepository which you will test:

            DefaultTasksRepositoryTest.kt

                private lateinit var tasksRemoteDataSource: FakeDataSource
                private lateinit var tasksLocalDataSource: FakeDataSource

                // Class under test
                private lateinit var tasksRepository: DefaultTasksRepository

  Now you'll make a method to setup and initialize a testable
  DefaultTasksRepository. This DefaultTasksRepository will use
  your test double FakeDataSources.

    5. Create a method called createRepository and annotate it with @Before.

    6. Instantiate your fake data sources, using the remoteTasks and localTasks lists.

    7. Instantiate your tasksRepository, using the two fake data sources you just created and Dispatchers.Unconfined.

  The final method should look like this:
`TODO 3.11`
      DefaultTasksRepositoryTest.kt
                @Before
                fun createRepository() {
                    tasksRemoteDataSource = FakeDataSource(remoteTasks.toMutableList())
                    tasksLocalDataSource = FakeDataSource(localTasks.toMutableList())
                    // Get a reference to the class under test
                    tasksRepository = DefaultTasksRepository(
                        // TODO Dispatchers.Unconfined should be replaced with Dispatchers.Main
                        //  this requires understanding more about coroutines + testing
                        //  so we will keep this as Unconfined for now.
                        tasksRemoteDataSource, tasksLocalDataSource, Dispatchers.Unconfined
                    )
                }
Step 3: Write DefaultTasksRepository's getTasks() Test

  Time to write a DefaultTasksRepository test!
`TODO 3.12`
    1. Write a test for the repository's getTasks method. Check that when
       you call get tasks with true (meaning that it should reload from
       the remote data source) that it returns data from the remote data
       source (as opposed to the local data source):

        DefaultTasksRepositoryTest.kt
              @Test
                  fun getTasks_requestsAllTasksFromRemoteDataSource(){
                      // When tasks are requested from the tasks repository
                      val tasks = tasksRepository.getTasks(true) as Success

                      // Then tasks are loaded from the remote data source
                      assertThat(tasks.data, IsEqual(remoteTasks))
                  }
  You will get an error when you call getTasks:

https://video.udacity-data.com/topher/2019/October/5da0c6d5_11.testrepowconstructordi/11.testrepowconstructordi.png

Step 4: Add runBlockingTest
`TODO 3.13`
    1. Add the required dependencies for testing coroutines to the test
       source set by using testImplementation:

          app/build.gradle
                  testImplementation "org.jetbrains.kotlinx:kotlinx-coroutines-test:$coroutinesVersion"

  Don't forget to sync!

  You should use runBlockingTest in your test classes when you're calling
  a suspend function.

    2. Add the @ExperimentalCoroutinesApi above the class.
https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines/-experimental-coroutines-api/

    3. Back in your DefaultTasksRepositoryTest add runBlockingTest so
       that it takes in your entire test as a "block" of code
https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-test/kotlinx.coroutines.test/run-blocking-test.html

  This final test looks like:

    DefaultTasksRepositoryTest.kt
              @ExperimentalCoroutinesApi
              class DefaultTasksRepositoryTest {

                  private val task1 = Task("Title1", "Description1")
                  private val task2 = Task("Title2", "Description2")
                  private val task3 = Task("Title3", "Description3")
                  private val remoteTasks = listOf(task1, task2).sortedBy { it.id }
                  private val localTasks = listOf(task3).sortedBy { it.id }
                  private val newTasks = listOf(task3).sortedBy { it.id }

                  private lateinit var tasksRemoteDataSource: FakeDataSource
                  private lateinit var tasksLocalDataSource: FakeDataSource

                  // Class under test
                  private lateinit var tasksRepository: DefaultTasksRepository

                  @Before
                  fun createRepository() {
                      tasksRemoteDataSource = FakeDataSource(remoteTasks.toMutableList())
                      tasksLocalDataSource = FakeDataSource(localTasks.toMutableList())
                      // Get a reference to the class under test
                      tasksRepository = DefaultTasksRepository(
                          // TODO Dispatchers.Unconfined should be replaced with Dispatchers.Main
                          //  this requires understanding more about coroutines + testing
                          //  so we will keep this as Unconfined for now.
                          tasksRemoteDataSource, tasksLocalDataSource, Dispatchers.Unconfined
                      )
                  }
`TODO 3.14`
                  @Test
                  fun getTasks_requestsAllTasksFromRemoteDataSource() = runBlockingTest {
                      // When tasks are requested from the tasks repository
                      val tasks = tasksRepository.getTasks(true) as Success

                      // Then tasks are loaded from the remote data source
                      assertThat(tasks.data, IsEqual(remoteTasks))
                  }

              }
`TODO 3.15`
@ExperimentalCouroutinesApi added to the above function
  4. Run your new getTasks_requestsAllTasksFromRemoteDataSource test and
     confirm it works and the error is gone! Splendid!

________________________________________________________________________________

                5. Where else to use Dependency Injection?
________________________________________________________________________________


You're going to set up the TasksViewModel for testing. Answer the following questions.

QUESTION 1 OF 6
Given you are writing tests for the TasksViewModel, what class should
you make a test double for?

 tip What does TasksViewModel directly depend on?

  R: DefaultTasksRepository

  Commet: Yes. DefaultTasksRepository is the complicated dependency that all
          of the view models, including TasksViewModel, have.

QUESTION 2 OF 6
What type of test double should we make?

  R: Fake

  Comment: Correct, a Fake will work well for this situation. Much like
           the data sources you need a "working" but less complicated
           implementation.

QUESTION 3 OF 6
What type of dependency injection should we use here?

Which class needs to take in the dependency?
  R: Constructor injection

  Comment: Yep, similar to last time we want to do constructor injection

QUESTION 4 OF 6
Which class should we change the constructor of to use constructor dependency injection?

tip: Which class needs to take in the dependency?

  R: ViewModel

  Comment: Right. Since the ViewModel is what we are testing, you'll modify it's constructor to take in the dependency.

QUESTION 5 OF 6
Which dependency is the one you're going to create a fake version of?

tip: What are the dependencies you will inject?

  R: Repository

  Comment: Yes, the repository is the dependency you will inject into the ViewModel.

QUESTION 6 OF 6

This is review from the previous course. What class must you implement to change the constructor of a ViewModel?

  R: ViewModelProvider.Factory
  Comment: Yep. You must implement a ViewModelProvider.Factory to change what a ViewModel is constructed with.

________________________________________________________________________________

                    6. Set Up a Fake Repository
________________________________________________________________________________

In this step you'll set up a Fake repository called FakeTestRepository.

Step 1: Create a TasksRepository Interface

  The first step towards using constructor dependency injection, is to
  create a common interface shared between the fake and the real class.

    1. Open DefaultTasksRepository and right click on the class name.
       Then select Refactor -> Extract -> Interface:

https://video.udacity-data.com/topher/2019/October/5dadc659_6.setupafakerepo1/6.setupafakerepo1.png

    2. Choose Extract to separate file:

https://video.udacity-data.com/topher/2019/October/5dadc65a_6.setupafakerepo2/6.setupafakerepo2.png

    3. In the Extract Interface window, change the interface name
       to TasksRepository.

    4. In the Members to form interface section, check all members
       except the two companion members and the private methods:

https://video.udacity-data.com/topher/2019/October/5dadc65c_6.setupafakerepo3/6.setupafakerepo3.png

`TODO 4.1`
    5. Click Refactor. The new TasksRepository interface should appear
       in the data/source package:

https://video.udacity-data.com/topher/2019/October/5dadc65c_6.setupafakerepo4/6.setupafakerepo4.png

  And DefaultTasksRepository now implements TasksRepository.


    6. Run your app (not the tests) to make sure everything is still in working order:

Step 2: Create FakeTestRepository

  Now that you have the interface, you can create the DefaultTaskRepository test double.

    1. In the test source set, in data/source create the kotlin class FakeTestRepository.kt.

    `TODO 4.2`
    2. Extend from the TasksRepository interface:

FakeTestRepository.kt
            class FakeTestRepository : TasksRepository  {
            }

`TODO 4.3`
  You now will be told you need to implement the interface methods.

    3. Hover over the error until you see the suggestion menu, then click
       and select Implement members:

https://video.udacity-data.com/topher/2019/October/5dadc65d_6.setupafakerepo6/6.setupafakerepo6.png

    4. Select all of the methods and press OK:

https://video.udacity-data.com/topher/2019/October/5dadc65d_6.setupafakerepo7/6.setupafakerepo7.png

Step 3. Implement FakeTestRepository methods
`TODO 4.4`
    1. Add both a LinkedHashMap variable representing the current list
       of tasks and a MutableLiveData for your observable
       tasks: FakeTestRepository.kt

              class FakeTestRepository : TasksRepository {

                  var tasksServiceData: LinkedHashMap<String, Task> = LinkedHashMap()

                  private val observableTasks = MutableLiveData<Result<List<Task>>>()


                  // Rest of class
              }

Implement the following methods:

    2. getTasks - This method should just take the tasksServiceData and turn it into a list using tasksServiceData.values.toList() and then return that as a Success result.

    3. refreshTasks - Updates the value of observableTasks to be what is returned by getTasks().

    4. observeTasks - Create a coroutine using runBlocking and run refreshTasks, then return observableTasks.

  Here are those methods:

    FakeTestRepository.kt
              class FakeTestRepository : TasksRepository {

                  var tasksServiceData: LinkedHashMap<String, Task> = LinkedHashMap()

                  private val observableTasks = MutableLiveData<Result<List<Task>>>()

                  override suspend fun getTasks(forceUpdate: Boolean): Result<List<Task>> {
                      return Result.Success(tasksServiceData.values.toList())
                  }

                  override suspend fun refreshTasks() {
                      observableTasks.value = getTasks()
                  }

                  override fun observeTasks(): LiveData<Result<List<Task>>> {
                      runBlocking { refreshTasks() }
                      return observableTasks
                  }

                  // Rest of class

              }

Step 4: Add a Method for Testing to addTasks

`TODO 4.5`
    1. Add the addTasks method, which takes in a vararg of tasks, adds
       each to the HashMap and then refreshes the tasks:

FakeTestRepository.kt
              fun addTasks(vararg tasks: Task) {
                  for (task in tasks) {
                      tasksServiceData[task.id] = task
                  }
                  runBlocking { refreshTasks() }
              }

    At this point you have a fake repository for testing with a few
    of the key methods implemented.

________________________________________________________________________________

                 7. Use the Fake Repository inside a ViewModel
________________________________________________________________________________


    In this task you'll use a fake class inside of a ViewModel. This will
    involve the use of a ViewModelProvider.Factory; this was explained in
    the Developing Android Apps with Kotlin Course's
    Lesson 5: App Architecture (UI Layer) - Concept 22.
    Exercise: Add a ViewModelFactory.

https://developer.android.com/reference/androidx/lifecycle/ViewModelProvider.Factory.html

Step 1: Make and use a ViewModelFactory in TasksViewModel
  You'll start with just updating the classes and test related to the Tasks screen.

    1. Open TasksViewModel.

`TODO 4.6`
    2. Change the constructor of TasksViewModel to take in TasksRepository rather than constructing it inside the class:

TasksViewModel.kt
              // REPLACE
              class TasksViewModel(application: Application) : AndroidViewModel(application) {

                  private val tasksRepository = DefaultTasksRepository.getRepository(application)

                  // Rest of class
              }


              // WITH

              class TasksViewModel( private val tasksRepository: TasksRepository ) : ViewModel() {
                  // Rest of class
              }

  Since you changed the constructor, you now need to use a
  ViewModelProvider.Factory to construct TasksViewModel. You'll put
  the factory class in the same file as the TasksViewModel, but you
  could also put it in its own file.
`TODO 4.7`
    3. At the bottom of the TasksViewModel file, outside the class, add a TasksViewModelFactory which takes in a plain TasksRepository:

    TasksViewModel.kt
              @Suppress("UNCHECKED_CAST")
              class TasksViewModelFactory (
                  private val tasksRepository: TasksRepository
              ) : ViewModelProvider.NewInstanceFactory() {
                  override fun <T : ViewModel> create(modelClass: Class<T>) =
                      (TasksViewModel(tasksRepository) as T)
              }

  Now that you have the factory, use it wherever you construct your view model.
`TODO 4.8`
    4. Update TasksFragment to use the factory:
    TasksFragment.kt
            // REPLACE
            private val viewModel by viewModels<TasksViewModel>()

            // WITH

            private val viewModel by viewModels<TasksViewModel> {
                TasksViewModelFactory(DefaultTasksRepository.getRepository(requireActivity().application))
            }

    5. Run your app code and make sure everything is still working!

Step 2: Use FakeTestRepository inside TasksViewModelTest

  Now instead of using the real repository in your view model tests, you can use the fake repository.

    1. Open up TasksViewModelTest.

`TODO 4.9`
    2. Add a FakeTestRepository property in the TasksViewModelTest:

              TasksViewModelTest.kt TKTK check
                            @RunWith(AndroidJUnit4::class)
                            class TasksViewModelTest {

                                // Use a fake repository to be injected into the viewmodel
                                private lateinit var tasksRepository: FakeTestRepository

                                // Rest of class
                            }

    3. Update the setupViewModel method to make a FakeTestRepository with three tasks and then construct the tasksViewModel with this repository.

      TasksViewModelTest.kt

                  @Before
                  fun setupViewModel() {
                      // We initialise the tasks to 3, with one active and two completed
                      tasksRepository = FakeTestRepository()
                      val task1 = Task("Title1", "Description1")
                      val task2 = Task("Title2", "Description2", true)
                      val task3 = Task("Title3", "Description3", true)
                      tasksRepository.addTasks(task1, task2, task3)

                      tasksViewModel = TasksViewModel(tasksRepository)

                  }
      4. Because you are no longer using the AndroidX Test ApplicationProvider.getApplicationContext code, you can also remove the @RunWith(AndroidJUnit4::class) annotation.

      5. Run your tests, make sure they all still work!

    By using constructor dependency injection, you've now removed the DefaultTasksRepository as a dependency and replaced it with your
    FakeTestRepository in the tests.

Step 3. Also Update TaskDetail Fragment and ViewModel

  Following the same sets you just completed, on your own, do the same steps for TaskDetailFragment and TaskDetailViewModel:

      1. Update the TaskDetailViewModel constructor to take in a TasksRepository.

      2. Add a TaskDetailViewModelFactory.

      3. Update the TaskDetailFragment to use the factory.

  Remember to run your application code! The app should work exactly the same, even though you refactored the code.

    If you'd like to avoid building a separate factory for each view model, check out the Architecture Blueprints reactive sample, which shows a slightly more complicated version of the tests you are building. It includes a generic ViewModelFactory that can generate any view model needed and this extension function.


    You are now able to use a FakeTestRepository instead of the real repository in TasksFragment and TasksDetailFragment.

________________________________________________________________________________

                          8. FragmentScenario
________________________________________________________________________________

                    NOTHING HERE

________________________________________________________________________________

                     9. Launch a Fragment from a Test
________________________________________________________________________________


In this step you'll use FragmentScenario to launch a fragment from a test. You can learn more about this in the documentation.
https://developer.android.com/reference/kotlin/androidx/fragment/app/testing/FragmentScenario.html
https://developer.android.com/guide/fragments/test

`TODO 5.2`
Step 1: Add Gradle Dependencies

    1. Add the following gradle dependencies:

              app/build.gradle
                  // Dependencies for Android instrumented unit tests
                  androidTestImplementation "junit:junit:$junitVersion"
                  androidTestImplementation "org.jetbrains.kotlinx:kotlinx-coroutines-test:$coroutinesVersion"

                  // Testing code should not be included in the main code.
                  // Once https://issuetracker.google.com/128612536 is fixed
                     this can be fixed.

                  implementation "androidx.fragment:fragment-testing:$fragmentVersion"
                  implementation "androidx.test:core:$androidXTestCoreVersion"

`TODO 5.1`
Step 2: Make a TaskDetailFragmentTest class

    1. Open taskdetail.TaskDetailFragment.


    2. Generate a test for TaskDetailFragment as you've done before. Accept the default choices and put it in the androidTest source set, NOT the test source set:

https://video.udacity-data.com/topher/2019/October/5dadc65e_8.launchfragmentfromtest1/8.launchfragmentfromtest1.png

    3. Add the following annotations to the TaskDetailFragmentTest class:

TaskDetailFragmentTest.kt
              @MediumTest
              @RunWith(AndroidJUnit4::class)
              class TaskDetailFragmentTest {

              }

`TODO 5.3`
Step 3: Launch a fragment from a test

    1. Copy this test into TaskDetailFragmentTest:

              TaskDetailFragmentTest.kt

                  @Test
                  fun activeTaskDetails_DisplayedInUi() {
                      // GIVEN - Add active (incomplete) task to the DB
                      val activeTask = Task("Active Task", "AndroidX Rocks", false)

                      // WHEN - Details fragment launched to display task
                      val bundle = TaskDetailFragmentArgs(activeTask.id).toBundle()
                      launchFragmentInContainer<TaskDetailFragment>(bundle, R.style.AppTheme)
                      Thread.sleep(2000)

                  }
Here you are:

    * Creating a task.

    * Creating a Bundle, which represents the fragment arguments for the task that get passed into the fragment).

    * The launchFragmentInContainer function creates a FragmentScenario, with this bundle and a theme.

    2. This is an instrumented test, so make sure the emulator or your device is visible.

    3. Run the test.

    A few things should happen. First, because this is an instrumented test, the test will run on either your physical device (if connected) or an emulator. It should launch the fragment. Notice how it doesn't navigate through any other fragment or have any menus associated with the activity - it is just the fragment.

Finally if you look closely, you'll notice that the fragment says "No data" - it doesn't actually successfully load up the task data.

https://video.udacity-data.com/topher/2019/October/5dadc65f_8.launchfragmentfromtest2/8.launchfragmentfromtest2.png

You have this FakeTestRepository, but you need to replace your real repository with your fake one for your fragment. You'll do this next!

________________________________________________________________________________


________________________________________________________________________________

                        10. Service Locators
________________________________________________________________________________


Let's make a ServiceLocator class

`TODO 5.4`
Step 1: Create the ServiceLocator

    1. Create the file ServiceLocator.kt in the top level of the main source set.

https://video.udacity-data.com/topher/2019/October/5dadc65f_9.servicelocators/9.servicelocators.png

    2. Define an object called ServiceLocator.
https://kotlinlang.org/docs/object-declarations.html#object-declarations
    3. Create database and repository instance variables and set both to null.
https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-volatile/
    4. Annotate the repository with @Volatile because it could get used by multiple threads (@Volatile is explained in detail here).
    https://developer.android.com/codelabs/kotlin-android-training-room-database?index=..%2F..android-kotlin-fundamentals#5

  Your code should look like this:

              ServiceLocator.kt

              object ServiceLocator {
`TODO 5.6`
                  private var database: ToDoDatabase? = null
                  @Volatile
                  var tasksRepository: TasksRepository? = null

              }

  Right now the only thing your ServiceLocator needs to do is know
  how to return a TasksRepository. It'll return a pre-existing
  DefaultTasksRepository or make and return a
  new DefaultTasksRepository if needed.

`TODO 5.5`
  You'll define the following functions:

    5. provideTasksRepository - Either provides an already existing repository or creates a new one. This method should be synchronized on this to avoid, in situations with multiple threads running, ever accidentally creating two repository instances.

    6. createTasksRepository- Code for creating a new repository. Will call createTaskLocalDataSource and create a new TasksRemoteDataSource.

    7. createTaskLocalDataSource - Code for creating a new local data source. Will call createDataBase.

    8. createDataBase - Code for creating a new database.

  The completed code is below:

              ServiceLocator.kt
              object ServiceLocator {

                  private var database: ToDoDatabase? = null
                  @Volatile
                  var tasksRepository: TasksRepository? = null

                  fun provideTasksRepository(context: Context): TasksRepository {
                      synchronized(this) {
                          return tasksRepository ?: createTasksRepository(context)
                      }
                  }

                  private fun createTasksRepository(context: Context): TasksRepository {
                      val newRepo = DefaultTasksRepository(TasksRemoteDataSource, createTaskLocalDataSource(context))
                      tasksRepository = newRepo
                      return newRepo
                  }

                  private fun createTaskLocalDataSource(context: Context): TasksDataSource {
                      val database = database ?: createDataBase(context)
                      return TasksLocalDataSource(database.taskDao())
                  }

                  private fun createDataBase(context: Context): ToDoDatabase {
                      val result = Room.databaseBuilder(
                          context.applicationContext,
                          ToDoDatabase::class.java, "Tasks.db"
                      ).build()
                      database = result
                      return result
                  }
              }

Good job. Now that you have a ServiceLocator, you'll use it next.
________________________________________________________________________________


________________________________________________________________________________

                        11. Use a Service Locator
________________________________________________________________________________

  In this step you'll refactor your main application code to
  use your ServiceLocator.

`TODO 6.1`
Step 1: Use ServiceLocator in Application

    1. At the top level of your package hierarchy, open TodoApplication and
       create a val for your repository and assign it a repository that is
       obtained using ServiceLocator.provideTaskRepository:

  TodoApplication.kt
              class TodoApplication : Application() {

                  val taskRepository: TasksRepository
                      get() = ServiceLocator.provideTasksRepository(this)

                  override fun onCreate() {
                      super.onCreate()
                      if (BuildConfig.DEBUG) Timber.plant(DebugTree())
                  }
              }

`TODO 6.2`
    2. Open DefaultTasksRepository and delete the companion object:

  DefaultTasksRepository.kt
              //  DELETE THIS COMPANION OBJECT
              companion object {
                  @Volatile
                  private var INSTANCE: DefaultTasksRepository? = null

                  fun getRepository(app: Application): DefaultTasksRepository {
                      return INSTANCE ?: synchronized(this) {
                          val database = Room.databaseBuilder(app,
                              ToDoDatabase::class.java, "Tasks.db")
                              .build()
                          DefaultTasksRepository(TasksRemoteDataSource, TasksLocalDataSource(database.taskDao())).also {
                              INSTANCE = it
                          }
                      }
                  }
              }

`TODO 6.3`
    3. Open TaskDetailFragement and find the call to getRepository
       at the top of the class. Replace this call with a call that
       gets the repository from TodoApplication:

  TaskDetailFragment.kt
              // REPLACE this code
              private val viewModel by viewModels<TaskDetailViewModel> {
                  TaskDetailViewModelFactory(DefaultTasksRepository.
                    getRepository(requireActivity().application))
              }
              // WITH this code
              private val viewModel by viewModels<TaskDetailViewModel> {
                  TaskDetailViewModelFactory((requireContext().applicationContext as TodoApplication).taskRepository)
              }

`TODO 6.4`
    5. Do the same for TasksFragment:

  TasksFragment.kt
              // REPLACE this code
                  private val viewModel by viewModels<TasksViewModel> {
                      TasksViewModelFactory(DefaultTasksRepository.
                        getRepository(requireActivity().application))
                  }
              // WITH this code
                  private val viewModel by viewModels<TasksViewModel> {
                      TasksViewModelFactory((requireContext().applicationContext as TodoApplication).taskRepository)
                  }

`TODO 6.5`
    6. For StatisticsViewModel and AddEditTaskViewModel you should update
       the code that acquires the repository to use the repository
       from the TodoApplication as well:

  TasksFragment.kt
              // REPLACE this code
                  private val tasksRepository = DefaultTasksRepository.getRepository(application)

              // WITH this code

                  private val tasksRepository = (application as TodoApplication).taskRepository

    7. Run your application (not the test)!

  Since you only refactored, the app should run the same without issue.

________________________________________________________________________________




________________________________________________________________________________

                12. Use Your Service Locator in your Tests
________________________________________________________________________________

  Now you'll use the ServiceLocator to swap a fake into your view model
  and fragment integration tests.

Step 1: Create FakeAndroidTestRepository

  You already have a FakeTestRepository in the test source set. You cannot share test classes between the test and androidTest source sets by default. So, you need to make a duplicate FakeTestRepository class in the androidTest source set, but call it FakeAndroidTestRepository.

  If you'd like to share files between the test and androidTest source set, you can configure, via gradle, a sharedTest folder as seen in the Architecture Blueprints reactive sample.
https://github.com/android/architecture-samples/blob/f4128dd8dbea5d1aac5d5acd5f346bb82187fbe6/app/build.gradle#L20
https://github.com/android/architecture-samples/tree/reactive/app/src
https://github.com/android/architecture-samples/tree/reactive

    1. Right click the androidTest source set and make a data package. Right click again and make a source package.

    2. Make new class in this source package called FakeAndroidTestRepository.kt.

`TODO 7.1`
    3. Copy over the following code to that class:

              FakeAndroidTestRepository.kt

              import androidx.annotation.VisibleForTesting
              import androidx.lifecycle.LiveData
              import androidx.lifecycle.MutableLiveData
              import androidx.lifecycle.map
              import com.example.android.architecture.blueprints.todoapp.data.Result
              import com.example.android.architecture.blueprints.todoapp.data.Result.Error
              import com.example.android.architecture.blueprints.todoapp.data.Result.Success
              import com.example.android.architecture.blueprints.todoapp.data.Task
              import kotlinx.coroutines.runBlocking
              import java.util.LinkedHashMap


              class FakeAndroidTestRepository : TasksRepository {

                  var tasksServiceData: LinkedHashMap<String, Task> = LinkedHashMap()

                  private var shouldReturnError = false

                  private val observableTasks = MutableLiveData<Result<List<Task>>>()

                  fun setReturnError(value: Boolean) {
                      shouldReturnError = value
                  }

                  override suspend fun refreshTasks() {
                      observableTasks.value = getTasks()
                  }

                  override suspend fun refreshTask(taskId: String) {
                      refreshTasks()
                  }

                  override fun observeTasks(): LiveData<Result<List<Task>>> {
                      runBlocking { refreshTasks() }
                      return observableTasks
                  }

                  override fun observeTask(taskId: String): LiveData<Result<Task>> {
                      runBlocking { refreshTasks() }
                      return observableTasks.map { tasks ->
                          when (tasks) {
                              is Result.Loading -> Result.Loading
                              is Error -> Error(tasks.exception)
                              is Success -> {
                                  val task = tasks.data.firstOrNull() { it.id == taskId }
                                      ?: return@map Error(Exception("Not found"))
                                  Success(task)
                              }
                          }
                      }
                  }

                  override suspend fun getTask(taskId: String, forceUpdate: Boolean): Result<Task> {
                      if (shouldReturnError) {
                          return Error(Exception("Test exception"))
                      }
                      tasksServiceData[taskId]?.let {
                          return Success(it)
                      }
                      return Error(Exception("Could not find task"))
                  }

                  override suspend fun getTasks(forceUpdate: Boolean): Result<List<Task>> {
                      if (shouldReturnError) {
                          return Error(Exception("Test exception"))
                      }
                      return Success(tasksServiceData.values.toList())
                  }

                  override suspend fun saveTask(task: Task) {
                      tasksServiceData[task.id] = task
                  }

                  override suspend fun completeTask(task: Task) {
                      val completedTask = Task(task.title, task.description, true, task.id)
                      tasksServiceData[task.id] = completedTask
                  }

                  override suspend fun completeTask(taskId: String) {
                      // Not required for the remote data source.
                      throw NotImplementedError()
                  }

                  override suspend fun activateTask(task: Task) {
                      val activeTask = Task(task.title, task.description, false, task.id)
                      tasksServiceData[task.id] = activeTask
                  }

                  override suspend fun activateTask(taskId: String) {
                      throw NotImplementedError()
                  }

                  override suspend fun clearCompletedTasks() {
                      tasksServiceData = tasksServiceData.filterValues {
                          !it.isCompleted
                      } as LinkedHashMap<String, Task>
                  }

                  override suspend fun deleteTask(taskId: String) {
                      tasksServiceData.remove(taskId)
                      refreshTasks()
                  }

                  override suspend fun deleteAllTasks() {
                      tasksServiceData.clear()
                      refreshTasks()
                  }


                  fun addTasks(vararg tasks: Task) {
                      for (task in tasks) {
                          tasksServiceData[task.id] = task
                      }
                      runBlocking { refreshTasks() }
                  }
              }

Step 2: Prepare your ServiceLocator for Tests

    1. Open ServiceLocator.kt.

`TODO 7.2`
    2. Mark the setter for tasksRepository as @VisibleForTesting.

  ServiceLocator.kt
                  @Volatile
                  var tasksRepository: TasksRepository? = null
                      @VisibleForTesting set

  One of the downsides of using a service locator is that it is a shared singleton. In addition to needing to reset the state of the service locator when the test finishes, you cannot run tests in parallel.

  This doesn't happen when you use dependency injection which is one of the
  reasons to prefer constructor dependency injection when you can use it.

  You can read the documentation to learn more about the trade offs.

    3. Add an instance variable called lock with the Any value:

  ServiceLocator.kt
                private val lock = Any()
`TODO 7.4`
    4. Add a testing specific method called resetRepository which clears out
       the database and sets both the repository and database to null:

  ServiceLocator.kt
                  @VisibleForTesting
                  fun resetRepository() {
                      synchronized(lock) {
                          runBlocking {
                              TasksRemoteDataSource.deleteAllTasks()
                          }
                          // Clear all data to avoid test pollution.
                          database?.apply {
                              clearAllTables()
                              close()
                          }
                          database = null
                          tasksRepository = null
                      }
                  }

Step 3: Use your ServiceLocator

    1. Open TaskDetailFragmentTest.

    2. Declare a lateinit TasksRepository variable.

    3. Add a setup and tear down method which sets up a
       FakeAndroidTestRepository before each test and cleans it up after each test:

`TODO 7.3`
  TaskDetailFragmentTest.kt
                  private lateinit var repository: TasksRepository

                  @Before
                  fun initRepository() {
                      repository = FakeAndroidTestRepository()
                      ServiceLocator.tasksRepository = repository
                  }
`TODO 7.5`
                  @After
                  fun cleanupDb() = runBlockingTest {
                      ServiceLocator.resetRepository()
                  }

    4. Wrap the function body of activeTaskDetails_DisplayedInUi() in
       runBlockingTest.

`TODO 7.6`
    5. Save activeTask in the repository before launching the fragment.

                  repository.saveTask(activeTask)

  The final test looks like this:

  TaskDetailFragmentTest.kt

              @Test
              fun activeTaskDetails_DisplayedInUi()  = runBlockingTest{
                  // GIVEN - Add active (incomplete) task to the DB
                  val activeTask = Task("Active Task", "AndroidX Rocks", false)
                  repository.saveTask(activeTask)

                  // WHEN - Details fragment launched to display task
                  val bundle = TaskDetailFragmentArgs(activeTask.id).toBundle()
                  launchFragmentInContainer<TaskDetailFragment>(bundle, R.style.AppTheme)

              }

    6. Annotate the whole class with @ExperimentalCoroutinesApi.

  When finished, the code will look like this:

  TaskDetailFragmentTest.kt

              @MediumTest
              @ExperimentalCoroutinesApi
              @RunWith(AndroidJUnit4::class)
              class TaskDetailFragmentTest {

                  private lateinit var repository: TasksRepository

                  @Before
                  fun initRepository() {
                      repository = FakeAndroidTestRepository()
                      ServiceLocator.tasksRepository = repository
                  }

                  @After
                  fun cleanupDb() = runBlockingTest {
                      ServiceLocator.resetRepository()
                  }


                  @Test
                  fun activeTaskDetails_DisplayedInUi()  = runBlockingTest{
                      // GIVEN - Add active (incomplete) task to the DB
                      val activeTask = Task("Active Task", "AndroidX Rocks", false)
                      repository.saveTask(activeTask)

                      // WHEN - Details fragment launched to display task
                      val bundle = TaskDetailFragmentArgs(activeTask.id).toBundle()
                      launchFragmentInContainer<TaskDetailFragment>(bundle, R.style.AppTheme)

                  }

              }

    7. Run the activeTaskDetails_DisplayedInUi() test.

  Much like before, you should see the fragment, except this time, because
  you properly set up the repository, it now shows the task information.

https://video.udacity-data.com/topher/2019/October/5dadc660_11.useservicelocatorsintest/11.useservicelocatorsintest.png
________________________________________________________________________________




________________________________________________________________________________

                    13. Using Espresso to Test a Fragment
________________________________________________________________________________

  Time to write an Espresso test.

Step 1: Turn off Animations

  For Espresso UI testing, it's best practice to turn animations off (also your test will run faster!):

    1. On your testing device, go to Settings > Developer options.

    2. Disable these three settings: Window animation scale, Transition
       animation scale and Animator duration scale:

https://video.udacity-data.com/topher/2019/October/5dadc660_12.usingespressototestafrag/12.usingespressototestafrag.png

Step 2: Add an Espresso Test

  The majority of espresso statements are made up of four parts:

    1. Static Espresso method
https://developer.android.com/reference/androidx/test/espresso/Espresso.html#onView%28org.hamcrest.Matcher%3Candroid.view.View%3E%29
    2. ViewMatchers
https://developer.android.com/reference/androidx/test/espresso/matcher/ViewMatchers.html
    3. ViewAction
https://developer.android.com/reference/androidx/test/espresso/ViewAction.html
    4. ViewAssertion
https://developer.android.com/reference/androidx/test/espresso/assertion/ViewAssertions#matches

  Let's examine the full test.

    1. Open TaskDetailFragmentTest.kt.
`TODO 8.2`
    2. Update the activeTaskDetails_DisplayedInUi test:

  TaskDetailFragmentTest.kt

              @Test
              fun activeTaskDetails_DisplayedInUi() = runBlockingTest{
                  // GIVEN - Add active (incomplete) task to the DB
                  val activeTask = Task("Active Task", "AndroidX Rocks", false)
                  repository.saveTask(activeTask)

                  // WHEN - Details fragment launched to display task
                  val bundle = TaskDetailFragmentArgs(activeTask.id).toBundle()
                  launchFragmentInContainer<TaskDetailFragment>(bundle, R.style.AppTheme)

                  // THEN - Task details are displayed on the screen
                  // make sure that the title/description are both shown and correct
                  onView(withId(R.id.task_detail_title_text)).check(matches(isDisplayed()))
                  onView(withId(R.id.task_detail_title_text)).check(matches(withText("Active Task")))
                  onView(withId(R.id.task_detail_description_text)).check(matches(isDisplayed()))
                  onView(withId(R.id.task_detail_description_text)).check(matches(withText("AndroidX Rocks")))
                  // and make sure the "active" checkbox is shown unchecked
                  onView(withId(R.id.task_detail_complete_checkbox)).check(matches(isDisplayed()))
                  onView(withId(R.id.task_detail_complete_checkbox)).check(matches(not(isChecked())))
              }

  Here are the import statements if needed:

            import androidx.test.espresso.Espresso.onView
            import androidx.test.espresso.assertion.ViewAssertions.matches
            import androidx.test.espresso.matcher.ViewMatchers.isChecked
            import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
            import androidx.test.espresso.matcher.ViewMatchers.withId
            import androidx.test.espresso.matcher.ViewMatchers.withText
            import org.hamcrest.core.IsNot.not

  Everything after the // THEN comment uses Espresso.

    3. Run the test and confirm it passes.
________________________________________________________________________________




________________________________________________________________________________

                      14. Espresso Write Your Own Test
________________________________________________________________________________

Now it's time to write an Espresso test yourself.

  Step 1: Write an Espresso

    1. Create a new test called completedTaskDetails_DisplayedInUi and copy over this skeleton code:

  TaskDetailFragmentTest.kt

              @Test
              fun completedTaskDetails_DisplayedInUi() = runBlockingTest{
                  // GIVEN - Add completed task to the DB

                  // WHEN - Details fragment launched to display task

                  // THEN - Task details are displayed on the screen
                  // make sure that the title/description are both shown and correct
          }

    2. Looking at the previous test, complete this test.

    3. Run and confirm the test passes.

________________________________________________________________________________




________________________________________________________________________________

                      15. Solution: Text Espresso Write Your Own Test
________________________________________________________________________________


  The finished completedTaskDetails_DisplayedInUi should look like this
  when you're done:

  TaskDetailFragmentTest.kt

          @Test
          fun completedTaskDetails_DisplayedInUi() = runBlockingTest{
              // GIVEN - Add completed task to the DB
              val completedTask = Task("Completed Task", "AndroidX Rocks", true)
              repository.saveTask(completedTask)

              // WHEN - Details fragment launched to display task
              val bundle = TaskDetailFragmentArgs(completedTask.id).toBundle()
              launchFragmentInContainer<TaskDetailFragment>(bundle, R.style.AppTheme)

              // THEN - Task details are displayed on the screen
              // make sure that the title/description are both shown and correct
              onView(withId(R.id.task_detail_title_text)).check(matches(isDisplayed()))
              onView(withId(R.id.task_detail_title_text)).check(matches(withText("Completed Task")))
              onView(withId(R.id.task_detail_description_text)).check(matches(isDisplayed()))
              onView(withId(R.id.task_detail_description_text)).check(matches(withText("AndroidX Rocks")))
              // and make sure the "active" checkbox is shown unchecked
              onView(withId(R.id.task_detail_complete_checkbox)).check(matches(isDisplayed()))
              onView(withId(R.id.task_detail_complete_checkbox)).check(matches(isChecked()))
          }

________________________________________________________________________________




________________________________________________________________________________

                        16. Introduction to Mocks
________________________________________________________________________________

Nothing

________________________________________________________________________________





________________________________________________________________________________

                   17. Using Mockito to Write Navigation Tests
________________________________________________________________________________


  As you saw in the video, you'll write an integration test that
  includes the Navigation component. In doing so, you'll create
  a mock, using Mockito.

https://developer.android.com/guide/navigation
https://site.mockito.org/

  Step 1: Add Gradle Dependencies

`TODO 9.1`
    1. Add the gradle dependencies:

              app/build.gradle

                  // Dependencies for Android instrumented unit tests
                  androidTestImplementation "org.mockito:mockito-core:$mockitoVersion"

                  androidTestImplementation "com.linkedin.dexmaker:dexmaker-mockito:$dexMakerVersion"

                  androidTestImplementation "androidx.test.espresso:espresso-contrib:$espressoVersion"

`TODO 9.2`
  Step 2: Create TasksFragmentTest

    1. Open TasksFragment.

    2. Right click on the TasksFragment class name and select Generate
       then Test. Create a test in the androidTest source set.

    3. Copy over this code to the TasksFragmentTest:

  TasksFragmentTest.kt
              @RunWith(AndroidJUnit4::class)
              @MediumTest
              @ExperimentalCoroutinesApi
              class TasksFragmentTest {

                  private lateinit var repository: TasksRepository

                  @Before
                  fun initRepository() {
                      repository = FakeAndroidTestRepository()
                      ServiceLocator.tasksRepository = repository
                  }

                  @After
                  fun cleanupDb() = runBlockingTest {
                      ServiceLocator.resetRepository()
                  }

              }

`TODO 9.3`
    4. Add the test clickTask_navigateToDetailFragmentOne:

  TasksFragmentTest.kt
              @Test
              fun clickTask_navigateToDetailFragmentOne() = runBlockingTest {
                  repository.saveTask(Task("TITLE1", "DESCRIPTION1", false, "id1"))
                  repository.saveTask(Task("TITLE2", "DESCRIPTION2", true, "id2"))

                  // GIVEN - On the home screen
                  val scenario = launchFragmentInContainer<TasksFragment>(Bundle(), R.style.AppTheme)

              }

`TODO 9.4`
    5. Use Mockito's mock function to create a mock:

  TasksFragmentTest.kt
              val navController = mock(NavController::class.java)

    6. Make your new mock the fragment's NavController:

  TasksFragmentTest.kt
              scenario.onFragment {
                  Navigation.setViewNavController(it.view!!, navController)
              }

`TODO 9.5`
    7. Add the code to click on the item in the RecyclerView that has
       the text "TITLE1":

  TasksFragmentTest.kt
          // WHEN - Click on the first list item
                  onView(withId(R.id.tasks_list))
                      .perform(RecyclerViewActions.actionOnItem<RecyclerView.ViewHolder>(
                          hasDescendant(withText("TITLE1")), click()))

            RecyclerViewActions is part of the espresso-contrib library and
            lets you perform Espresso actions on a RecyclerView.
https://developer.android.com/training/testing/espresso/lists#recycler-view-list-items
`TODO 9.5`
    8. Verify that navigate was called, with the correct argument:

            TasksFragmentTest.kt

            // THEN - Verify that we navigate to the first detail screen
            verify(navController).navigate(
                TasksFragmentDirections.actionTasksFragmentToTaskDetailFragment( "id1")

  The complete test looks like this:

          TasksFragmentTest.kt

          @Test
          fun clickTask_navigateToDetailFragmentOne() = runBlockingTest {
              repository.saveTask(Task("TITLE1", "DESCRIPTION1", false, "id1"))
              repository.saveTask(Task("TITLE2", "DESCRIPTION2", true, "id2"))

              // GIVEN - On the home screen
              val scenario = launchFragmentInContainer<TasksFragment>(Bundle(), R.style.AppTheme)

                  val navController = mock(NavController::class.java)
              scenario.onFragment {
                  Navigation.setViewNavController(it.view!!, navController)
              }

              // WHEN - Click on the first list item
              onView(withId(R.id.tasks_list))
                  .perform(RecyclerViewActions.actionOnItem<RecyclerView.ViewHolder>(
                      hasDescendant(withText("TITLE1")), click()))


              // THEN - Verify that we navigate to the first detail screen
              verify(navController).navigate(
                  TasksFragmentDirections.actionTasksFragmentToTaskDetailFragment( "id1")
              )
          }

    9. As always, remember to run your test!

  In summary, to test navigation you can:

    1. Use Mockito to create a NavController mock.

    2. Attach that mocked NavController to the fragment.

    3. Verify that navigate was called with the correct action and parameter(s).

  Optional Step: Optional, write clickAddTaskButton_navigateToAddEditFragment
  To see if you can write a navigation test yourself, try this:

    1. Write the test clickAddTaskButton_navigateToAddEditFragment which
       checks that if you click on the + FAB, you navigate to the
       AddEditTaskFragment.
________________________________________________________________________________


________________________________________________________________________________

          18. Solution: Write Your Own Integration Test with Navigation
________________________________________________________________________________

  If you want to take a look at the solution up to this point, you can check
  out this Github repo. You can compare the code from the end of the last
  lesson to where the code is now here.

https://github.com/udacity/android-testing/tree/end_codelab_2
https://github.com/udacity/android-testing/compare/end_codelab_1...end_codelab_2

The answer is:

  TasksFragmentTest.kt
          @Test
          fun clickAddTaskButton_navigateToAddEditFragment() {
              // GIVEN - On the home screen
              val scenario = launchFragmentInContainer<TasksFragment>(Bundle(), R.style.AppTheme)
              val navController = mock(NavController::class.java)
              scenario.onFragment {
                  Navigation.setViewNavController(it.view!!, navController)
              }

              // WHEN - Click on the "+" button
              onView(withId(R.id.add_task_fab)).perform(click())

              // THEN - Verify that we navigate to the add screen
              verify(navController).navigate(
                  TasksFragmentDirections.actionTasksFragmentToAddEditTaskFragment(
                      null, getApplicationContext<Context>().getString(R.string.add_task)
                  )
              )
          }

________________________________________________________________________________





















































































































































































































































________________________________________________________________________________

                              LESSON 5
                    Testing: Survey of Advanced Topics

      Learning how to Navigation Testing, Coroutines, Room, Databinding,
                      and End to End Tests.
________________________________________________________________________________



________________________________________________________________________________

            3. Code Checkpoint: viewModelScope and TestCoroutineDispatcher
________________________________________________________________________________


  In this step you'll write a test for code that uses viewModelScope - you'll
  write a test that checks that when a task is completed, the snackbar shows
  the correct message. To complete this test, you'll need to swap the default
  Dispatchers.Main for a TestCoroutineDispatcher.

  If you're curious, you can learn more about viewModelScope in the blogpost
  Easy Coroutines in Android: viewModelScope.

https://medium.com/androiddevelopers/easy-coroutines-in-android-viewmodelscope-25bffb605471

Optional Step: Download the Code (Code Checkpoint)

  If you haven't been following along or want to download the code up to this
  point, you can do so now. Download the code here, download a zip of the code
  here, OR you can clone the Github repository for the code:

              $ git clone https://github.com/udacity/android-testing.git
              $ cd android-architecture
              $ git checkout end_codelab_2

Step 1: Observe the Issue

  Start by adding the new completeTask_dataAndSnackbarUpdated test.

    1. Open test > tasks > TasksViewModelTest

`TODO 10.1`
    2. Add this new test method:

    TasksViewModelTest.kt

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

    3. Run this new test. You should observe that it fails with the following error:

  "Exception in thread "main" java.lang.IllegalStateException: Module with
  the Main dispatcher had failed to initialize. For tests Dispatchers.setMain
  from kotlinx-coroutines-test module can be used."

`TODO 10.2`
Step 2: Replace Dispatcher.Main with TestCoroutineDispatcher

    1. In TasksViewModelTest, create a TestCoroutineDispatcher as a val
       called testDispatcher.

  Swap this testDispatcher in exchange for the standard Main dispatcher.

    2. Create a @Before method that calls Dispatchers.setMain(testDispatcher)
       before every test.

    3. Create an @After method that cleans everything up after running each
       test by calling Dispatchers.resetMain() and
       then testDispatcher.cleanupTestCoroutines().

  Here's what this code looks like:

    TasksViewModelTest.kt

              @ExperimentalCoroutinesApi
              val testDispatcher: TestCoroutineDispatcher = TestCoroutineDispatcher()

              @ExperimentalCoroutinesApi
              @Before
              fun setupDispatcher() {
                  Dispatchers.setMain(testDispatcher)
              }

              @ExperimentalCoroutinesApi
              @After
              fun tearDownDispatcher() {
                  Dispatchers.resetMain()
                  testDispatcher.cleanupTestCoroutines()
              }

    4. Run your test again. It should now pass! Good work!

________________________________________________________________________________





________________________________________________________________________________

              4. MainCoroutineRule and Injecting Dispatchers

________________________________________________________________________________


  In this step you'll create the MainCoroutineRule JUnit rule and use it in
  TasksViewModelTest and DefaultTasksRepositoryTest.
https://junit.org/junit4/javadoc/4.12/org/junit/Rule.html

Step 1: Add MainCoroutineRule

    1. Create a new class called MainCoroutineRule.kt in the root folder of the test source set.

`TODO 10.3`
    2. Copy over the following code toMainCoroutineRule.kt:

    MainCoroutineRule.kt

              @ExperimentalCoroutinesApi
              class MainCoroutineRule(val dispatcher: TestCoroutineDispatcher = TestCoroutineDispatcher()):
                 TestWatcher(),
                 TestCoroutineScope by TestCoroutineScope(dispatcher) {
                 override fun starting(description: Description?) {
                     super.starting(description)
                     Dispatchers.setMain(dispatcher)
                 }

                 override fun finished(description: Description?) {
                     super.finished(description)
                     cleanupTestCoroutines()
                     Dispatchers.resetMain()
                 }
              }

Step 2: Use MainCoroutineRule in TasksViewModelTest

  Now use your new rule.

    1. Open TasksViewModelTest.

`TODO 10.4`
    2. Replace TestDispatcher code you just wrote (the @Before and @After code
       to swap and cleanup the dispatcher) with code to use your
       new MainCoroutineRule:

    TasksViewModelTest.kt

            // REPLACE
            @ExperimentalCoroutinesApi
            val testDispatcher: TestCoroutineDispatcher = TestCoroutineDispatcher()

            @ExperimentalCoroutinesApi
            @Before
            fun setupDispatcher() {
                Dispatchers.setMain(testDispatcher)
            }

            @ExperimentalCoroutinesApi
            @After
            fun tearDownDispatcher() {
                Dispatchers.resetMain()
                testDispatcher.cleanupTestCoroutines()
            }


            // WITH
            @ExperimentalCoroutinesApi
            @get:Rule
            var mainCoroutineRule = MainCoroutineRule()

    3. Run completeTask_dataAndSnackbarUpdated, it should work exactly the same!

Step 3: Use MainCoroutineRule for repository testing.

  You can also use this rule in DefaultTasksRepositoryTest.

    1. Open up test > data > source > DefaultTasksRepositoryTest.kt

`TODO 10.5`
    2. Add the MainCoroutineRule inside of the DefaultTasksRepositoryTest class:

      DefaultTasksRepositoryTest.kt

            // Set the main coroutines dispatcher for unit testing.
            @ExperimentalCoroutinesApi
            @get:Rule
            var mainCoroutineRule = MainCoroutineRule()

  Remember that MainCoroutineRule swaps the Dispatcher.Main for
  a TestCoroutineDispatcher.

`TODO 10.6`
    3. Use Dispatcher.Main, instead of Dispatcher.Unconfined when defining
       your repository under test:

    DefaultTasksRepositoryTest.kt

            @Before
            fun createRepository() {
                tasksRemoteDataSource = FakeDataSource(remoteTasks.toMutableList())
                tasksLocalDataSource = FakeDataSource(localTasks.toMutableList())
                // Get a reference to the class under test.
                tasksRepository = DefaultTasksRepository(
                // HERE Swap Dispatcher.Unconfined
                    tasksRemoteDataSource, tasksLocalDataSource, Dispatchers.Main
                )
            }

  Generally, only create one TestCoroutineDispatcher to run a test.
  Whenever you call runBlockingTest, it will create a new
  TestCoroutineDispatcher if you don't specify one. MainCoroutineRule
  includes a TestCoroutineDispatcher. So, to ensure that you don't
  accidentally create multiple instances of TestCoroutineDispatcher, use
  the mainCoroutineRule.runBlockingTest instead of just runBlockingTest.

https://www.youtube.com/watch?v=KMb0Fs8rCRs&t=747s&ab_channel=AndroidDevelopers
`TODO 10.7`
    4. Replace runBlockingTest with mainCoroutineRule.runBlockingTest:

    DefaultTasksRepositoryTest.kt

            // REPLACE
            fun getTasks_requestsAllTasksFromRemoteDataSource() = runBlockingTest {

            // WITH
            fun getTasks_requestsAllTasksFromRemoteDataSource() = mainCoroutineRule.runBlockingTest {

    5. Run your DefaultTasksRepositoryTest class and confirm everything
       works as before!

  Awesome job! Now you're using TestCoroutineDispatcher in your code, which is
  a preferable dispatcher for testing. Next you'll see how to use an
  additional feature of the TestCoroutineDispatcher, controlling coroutine
  execution timing.

  MainCoroutineRule and many of the other concepts covered here are explained
  in detail in the talk Testing Coroutines on Android.

https://www.youtube.com/watch?v=KMb0Fs8rCRs&ab_channel=AndroidDevelopers


________________________________________________________________________________


________________________________________________________________________________

                          5. StatisticsViewModelTest
________________________________________________________________________________


  In the next step, you'll be writing tests for the StatisticViewModel. As a
  reminder, the StatisticViewModel holds all the data and does all of the
  calculations for the Statistics Screen:

https://video.udacity-data.com/topher/2020/January/5e31b0fc_5.statsviewmodeltest/5.statsviewmodeltest.png


  To set things up for testing the StatisticViewModel, you'll need
  to make two code changes:

    1. Update StatisticViewModel so that you can inject the fake repository.
       This is a review of what you did in 5.2 Testing: Intro to Test Doubles
       when you used the fake repository.

    2. Do the standard test setup for StatisticViewModelTest.

  Both of these are review and unrelated to coroutine timing, so feel free to copy/paste.

Step 1: Update StatisticsViewModel for Dependency Injection

    1. Open StatisticsViewModel.

`TODO 10.8`
    2. Change the constructor of StatisticsViewModel to take in TasksRepository
       instead of constructing it inside the class, so that you can inject a
       fake repository for testing:

    StatisticsViewModel.kt

            // REPLACE
            class StatisticsViewModel(application: Application) : AndroidViewModel(application) {

                private val tasksRepository = (application as TodoApplication).taskRepository

                // Rest of class
            }

            // WITH

            class StatisticsViewModel(
                private val tasksRepository: TasksRepository
            ) : ViewModel() {
                // Rest of class
            }

`TODO 10.9`
    3. At the bottom of the StatisticsViewModel file, outside the class, add a
       TasksViewModelFactory which takes in a plain TasksRepository:

    StatisticsViewModel.kt

            @Suppress("UNCHECKED_CAST")
            class StatisticsViewModelFactory (
                private val tasksRepository: TasksRepository
            ) : ViewModelProvider.NewInstanceFactory() {
                override fun <T : ViewModel> create(modelClass: Class<T>) =
                    (StatisticsViewModel(tasksRepository) as T)
            }

`TODO 10.10`
    4. Update StatisticsFragment to use the factory.

    StatisticsFragment.kt

            // REPLACE
            private val viewModel by viewModels<TasksViewModel>()

            // WITH

            private val viewModel by viewModels<StatisticsViewModel> {
                StatisticsViewModelFactory(
                    (requireContext().applicationContext as TodoApplication).taskRepository
                )
            }

    5. Run your application code and navigate to the StatisticsFragment to make
       sure your statistics screen works just like before.

Step 2: Create StatisticsViewModelTest

    1. Open StatisticsViewModel.kt.

    2. Right-click on the StatisticsViewModel class name and select Generate, then Test.

    3. Follow the prompts to create StatisticsViewModelTest in the test source set.

`TODO 10.11`
  Follow the steps below to set up your StatisticsViewModel test as you've done
  previously. This is a good review of what goes into a view model test:

    4. Add the InstantTaskExecutorRule since you are testing Architecture Components.

    5. Add the MainCoroutineRule since you are testing coroutines and view models.

    6. Create fields for the subject under test (StatisticsViewModel) and test
       doubles for its dependencies (FakeTestRepository).

    7. Create a @Before method that sets up the subject under test and dependencies.

  Your test should look like this:

    StatisticsViewModelTest.kt

              @ExperimentalCoroutinesApi
              class StatisticsViewModelTest {

                  // Executes each task synchronously using Architecture Components.
                  @get:Rule
                  var instantExecutorRule = InstantTaskExecutorRule()

                  // Set the main coroutines dispatcher for unit testing.
                  @ExperimentalCoroutinesApi
                  @get:Rule
                  var mainCoroutineRule = MainCoroutineRule()

                  // Subject under test
                  private lateinit var statisticsViewModel: StatisticsViewModel

                  // Use a fake repository to be injected into the view model.
                  private lateinit var tasksRepository: FakeTestRepository

                  @Before
                  fun setupStatisticsViewModel() {
                      // Initialise the repository with no tasks.
                      tasksRepository = FakeTestRepository()

                      statisticsViewModel = StatisticsViewModel(tasksRepository)
                  }
              }

________________________________________________________________________________


________________________________________________________________________________

                      6. Testing Coroutine Timing
________________________________________________________________________________


  In this step you'll use TestCouroutineDispatcher's pauseDispatcher and
  resumeDispatcher methods. Using these methods, you'll write a test that
  makes sure the loading indicator is shown when the statistics are
  loading, and then disappears once the statistics are loaded.
https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-test/kotlinx.coroutines.test/-delay-controller/pause-dispatcher.html
https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-test/kotlinx.coroutines.test/-delay-controller/resume-dispatcher.html

`TODO 10.12`
Step 1: Create a loading indicator test

  Copy the code below and run the test. This test fails.

    StatisticsViewModelTest.kt
            @Test
            fun loadTasks_loading() {

                // Load the task in the view model.
                statisticsViewModel.refresh()

                // Then progress indicator is shown.
                assertThat(statisticsViewModel.dataLoading.getOrAwaitValue(), `is`(true))

                // Then progress indicator is hidden.
                assertThat(statisticsViewModel.dataLoading.getOrAwaitValue(), `is`(false))
            }

  The test above doesn't really make sense because it's testing that
  dataLoading is both true and false at the same time.

    2. Look at the failure and see that the test fails because of the first assert statement.

  This test fails because the entire refresh() method completes before the
  loading indicator assert statements are made.
`TODO 10.12`
Step 2: Pause and Resume the dispatcher

    1. Update the test to use pauseDispatcher and resumeDispatcher so that
       you pause before executing the coroutine, check that the loading
       indicator is shown, then resume and check that the load is gone:

    StatisticsViewModelTest.kt
            @Test
            fun loadTasks_loading() {
                // Pause dispatcher so you can verify initial values.
                mainCoroutineRule.pauseDispatcher()

                // Load the task in the view model.
                statisticsViewModel.refresh()

                // Then assert that the progress indicator is shown.
                assertThat(statisticsViewModel.dataLoading.getOrAwaitValue(), `is`(true))

                // Execute pending coroutines actions.
                mainCoroutineRule.resumeDispatcher()

                // Then assert that the progress indicator is hidden.
                assertThat(statisticsViewModel.dataLoading.getOrAwaitValue(), `is`(false))
            }

    2. Run the test and see that it passes now.

  If you need even more fine-grained timing control, TestCouroutineDispatcher
  provides that as well. Check out:

    * advanceTimeBy
https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-test/kotlinx.coroutines.test/-delay-controller/advance-time-by.html
    * advanceUntilIdle
https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-test/kotlinx.coroutines.test/-delay-controller/advance-until-idle.html
    * runCurrent
https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-test/kotlinx.coroutines.test/-delay-controller/run-current.html

  Excellent - you've learned how to write coroutine tests that use
  TestCoroutineDispatcher's ability to pause and resume coroutine execution.
  This gives you more control when writing tests that require precise timing.

________________________________________________________________________________


________________________________________________________________________________

                          7. Testing Error Handling
________________________________________________________________________________

  In this step you'll test your application reacts appropriately when
  there's an error (such as data being unavailable from the network).

Step 1: Add an error flag to test double

    1. Open test > data > source > FakeTestRepository.

`TODO 10.13`
    2. Add a boolean flag called shouldReturnError and set it initially
       to false, which means that by default an error is not returned.

    FakeTestRepository.kt
            private var shouldReturnError = false

`TODO 10.14`
    3. Create a setReturnError method that changes whether or not
       the repository should return errors:

    FakeTestRepository.kt
            fun setReturnError(value: Boolean) {
                shouldReturnError = value
            }

`TODO 10.15`
    4. Wrap getTask and getTasks in if statements so that if
       shouldReturnError is true, the method returns Result.Error:

    FakeTestRepository.kt
              override suspend fun getTask(taskId: String, forceUpdate: Boolean): Result<Task> {
                  if (shouldReturnError) {
                      return Error(Exception("Test exception"))
                  }
                  tasksServiceData[taskId]?.let {
                      return Success(it)
                  }
                  return Error(Exception("Could not find task"))
              }

              override suspend fun getTasks(forceUpdate: Boolean): Result<List<Task>> {
                  if (shouldReturnError) {
                      return Error(Exception("Test exception"))
                  }
                  return Success(tasksServiceData.values.toList())
              }

Step 2: Write a test for returned Error

  In StatisticsViewModel, there are two LiveData booleans (error and empty):

    StatisticsViewModel.kt
              class StatisticsViewModel(
                  private val tasksRepository: TasksRepository
              ) : ViewModel() {

                  private val tasks: LiveData<Result<List<Task>>> = tasksRepository.observeTasks()

                  // Other variables...    

                  val error: LiveData<Boolean> = tasks.map { it is Error }
                  val empty: LiveData<Boolean> = tasks.map { (it as? Success)?.data.isNullOrEmpty() }

                  // Rest of the code...    
              }

  These represent whether or not tasks loaded properly. If there is
  an error, error and empty should both be true.

    1. Open StatisticsViewModelTest.

    2. Create a new test called loadStatisticsWhenTasksAreUnavailable_callErrorToDisplay

    3. Call setReturnErrors() on tasksRepository, setting it to true.

    4. Call statisticsViewModel.refresh() to trigger a data load.

    5. Check that statisticsViewModel.empty and statisticsViewModel.error are both true.

`TODO 10.16`
  The full code for this test is below:

    StatisticsViewModelTest.kt
            @Test
            fun loadStatisticsWhenTasksAreUnavailable_callErrorToDisplay() {
                // Make the repository return errors.
                tasksRepository.setReturnError(true)
                statisticsViewModel.refresh()

                // Then empty and error are true (which triggers an error message to be shown).
                assertThat(statisticsViewModel.empty.getOrAwaitValue(), `is`(true))
                assertThat(statisticsViewModel.error.getOrAwaitValue(), `is`(true))
            }

    6. Run your test and observe it passing!

________________________________________________________________________________



________________________________________________________________________________

                          8. Testing Room
________________________________________________________________________________

  In this step you'll write tests for your Room database's DAO.

`TODO 10.17`
Step 1: Add the architecture component testing library to gradle

    1. Add the architecture component testing library to your instrumented
       tests, using androidTestImplementation:

    app/build.gradle
            androidTestImplementation "androidx.arch.core:core-testing:$archTestingVersion"

Step 2: Create the TasksDaoTest class

    1. In your project pane, navigate to androidTest > data > source.

    2. Right-click on the source package and create a new package called local.

    3. In local, create a Kotlin file and class called TasksDaoTest.kt.

https://video.udacity-data.com/topher/2020/January/5e31b0fc_8.testingroom/8.testingroom.png

Step 3: Set up the TasksDaoTest class

`TODO 10.18`
    1. Copy the following code to start your TasksDaoTest class:

    TasksDaoTest.kt
            @ExperimentalCoroutinesApi
            @RunWith(AndroidJUnit4::class)
            @SmallTest
            class TasksDaoTest {

                // Executes each task synchronously using Architecture Components.
                @get:Rule
                var instantExecutorRule = InstantTaskExecutorRule()

            }

    2. In TasksDaoTest, create a lateinit field for your database:

    TasksDaoTest.kt
            private lateinit var database: ToDoDatabase

    3. Make a @Before method for initializing your database:

    TasksDaoTest.kt
            @Before
            fun initDb() {
                // Using an in-memory database so that the information stored here disappears when the
                // process is killed.
                database = Room.inMemoryDatabaseBuilder(
                    getApplicationContext(),
                    ToDoDatabase::class.java
                ).build()
            }

    4. Make an @After method for cleaning up your database using database.close():

    TasksDaoTest.kt
            @After
            fun closeDb() = database.close()

  Once done, your code should look like:

    TasksDaoTest.kt
            @ExperimentalCoroutinesApi
            @RunWith(AndroidJUnit4::class)
            @SmallTest
            class TasksDaoTest {

                // Executes each task synchronously using Architecture Components.
                @get:Rule
                var instantExecutorRule = InstantTaskExecutorRule()


                private lateinit var database: ToDoDatabase

                @Before
                fun initDb() {
                    // Using an in-memory database so that the information stored here disappears when the
                    // process is killed.
                    database = Room.inMemoryDatabaseBuilder(
                        getApplicationContext(),
                        ToDoDatabase::class.java
                    ).allowMainThreadQueries().build()
                }

                @After
                fun closeDb() = database.close()

            }
Step 4: Write your first DAO test

  Your first DAO test will insert a task and then get the task by its id.

    1. Still in TasksDaoTest, copy the following test:

`TODO 10.19`
    TasksDaoTest.kt
              @Test
              fun insertTaskAndGetById() = runBlockingTest {
                  // GIVEN - Insert a task.
                  val task = Task("title", "description")
                  database.taskDao().insertTask(task)

                  // WHEN - Get the task by id from the database.
                  val loaded = database.taskDao().getTaskById(task.id)

                  // THEN - The loaded data contains the expected values.
                  assertThat<Task>(loaded as Task, notNullValue())
                  assertThat(loaded.id, `is`(task.id))
                  assertThat(loaded.title, `is`(task.title))
                  assertThat(loaded.description, `is`(task.description))
                  assertThat(loaded.isCompleted, `is`(task.isCompleted))
              }

  If needed, here are the imports:

    TasksDaoTest.kt
            import androidx.arch.core.executor.testing.InstantTaskExecutorRule
            import androidx.room.Room
            import androidx.test.core.app.ApplicationProvider.getApplicationContext
            import androidx.test.ext.junit.runners.AndroidJUnit4
            import androidx.test.filters.SmallTest
            import com.example.android.architecture.blueprints.todoapp.data.Task
            import kotlinx.coroutines.ExperimentalCoroutinesApi
            import kotlinx.coroutines.test.runBlockingTest
            import org.hamcrest.CoreMatchers.`is`
            import org.hamcrest.CoreMatchers.notNullValue
            import org.hamcrest.MatcherAssert.assertThat
            import org.junit.After
            import org.junit.Before
            import org.junit.Rule
            import org.junit.Test
            import org.junit.runner.RunWith

    2. Run your test and confirm that it passes.

Step 5: Try it yourself!

  Now try writing a DAO test yourself. Write a test that inserts
  a task, updates it, and then checks that it has the updated values.
  Below is starter code for updateTaskAndGetById.

    1. Copy this test starter code:

    TasksDaoTest.kt
            @Test
            fun updateTaskAndGetById() {
                // 1. Insert a task into the DAO.

                // 2. Update the task by creating a new task with the same ID but different attributes.

                // 3. Check that when you get the task by its ID, it has the updated values.
            }

    2. Finish the code, referring to the insertTaskAndGetById test you just added.

    3. Run your test and confirm it passes!

  The completed test is in the end_codelab_3 branch of the repository here, so that you can compare.
  https://github.com/udacity/android-testing/blob/end_codelab_3/app/src/androidTest/java/com/example/android/architecture/blueprints/todoapp/data/source/local/TasksDaoTest.kt

________________________________________________________________________________


________________________________________________________________________________

                        9. Testing Local Data Source
________________________________________________________________________________

  You just created unit tests for your TasksDao. In this step, you'll create
  integration tests for your TasksLocalDataSource. TasksLocalDatasource
  is a class that takes the information returned by the DAO and converts
  it to a format that is expected by your repository class
  (for example, it wraps returned values with Success or Error states).
  You'll be writing an integration test because you'll test both the
  real TasksLocalDatasource code and the real DAO code.

Step 1: Create an integration test for TasksLocalDataSource

  The steps for creating tests for your TasksLocalDataSourceTest are
  very similar to creating the DAO tests.

    1. Open your app's TasksLocalDataSource class.

    2. Right-click on the TasksLocalDataSource class name and select Generate, then Test.

    3. Follow the prompts to create TasksLocalDataSourceTest in the androidTest source set.

    4. Copy the following code:

    TasksLocalDataSourceTest.kt
              @ExperimentalCoroutinesApi
              @RunWith(AndroidJUnit4::class)
              @MediumTest
              class TasksLocalDataSourceTest {

                  // Executes each task synchronously using Architecture Components.
                  @get:Rule
                  var instantExecutorRule = InstantTaskExecutorRule()
              }

  Notice that the only real difference between this and the DAO testing
  code is that the TasksLocalDataSource can be considered a medium
  "integration" test (as seen by the @MediumTest annotation), because the
  TasksLocalDataSourceTest will test both the code in TasksLocalDataSource
  and how it integrates with the DAO code.

    5. In TasksLocalDataSourceTest, create a lateinit field for the two
       components you're testing–- TasksLocalDataSource and your database:

    TasksLocalDataSourceTest.kt

          private lateinit var localDataSource: TasksLocalDataSource
          private lateinit var database: ToDoDatabase

    6. Make a @Before method for initializing your database and datasource.

    7. Create your database in the same way you did for your DAO test, using
       the inMemoryDatabaseBuilder and the
       ApplicationProvider.getApplicationContext() method

    8. Add allowMainThreadQueries. Normally Room doesn't allow database
       queries to be run on the main thread. Calling allowMainThreadQueries
       turns off this check. Don't do this in production code!

https://developer.android.com/reference/androidx/room/RoomDatabase.Builder.html#allowMainThreadQueries%28%29

    9. Instantiate the TasksLocalDataSource, using your database and
       Dispatchers.Main. This will run your queries on the main
       thread (this is allowed because of allowMainThreadQueries).

    TasksLocalDataSourceTest.kt
              @Before
              fun setup() {
                  // Using an in-memory database for testing, because it doesn't survive killing the process.
                  database = Room.inMemoryDatabaseBuilder(
                      ApplicationProvider.getApplicationContext(),
                      ToDoDatabase::class.java
                  )
                      .allowMainThreadQueries()
                      .build()

                  localDataSource =
                      TasksLocalDataSource(
                          database.taskDao(),
                          Dispatchers.Main
                      )
              }
    10. Make an @After method for cleaning up your database using database.close().

  The complete code should look like this:

    TasksLocalDataSourceTest.kt
            @ExperimentalCoroutinesApi
            @RunWith(AndroidJUnit4::class)
            @MediumTest
            class TasksLocalDataSourceTest {

                private lateinit var localDataSource: TasksLocalDataSource
                private lateinit var database: ToDoDatabase


                // Executes each task synchronously using Architecture Components.
                @get:Rule
                var instantExecutorRule = InstantTaskExecutorRule()

                @Before
                fun setup() {
                    // Using an in-memory database for testing, because it doesn't survive killing the process.
                    database = Room.inMemoryDatabaseBuilder(
                        ApplicationProvider.getApplicationContext(),
                        ToDoDatabase::class.java
                    )
                        .allowMainThreadQueries()
                        .build()

                    localDataSource =
                        TasksLocalDataSource(
                            database.taskDao(),
                            Dispatchers.Main
                        )
                }

                @After
                fun cleanUp() {
                    database.close()
                }

            }
Step 2: Write your first TasksLocalDataSourceTest

  Let's copy and run an example test first.

    1. Copy these import statements:

            import com.example.android.architecture.blueprints.todoapp.data.source.TasksDataSource
            import com.example.android.architecture.blueprints.todoapp.data.Result.Success
            import com.example.android.architecture.blueprints.todoapp.data.Task
            import com.example.android.architecture.blueprints.todoapp.data.succeeded
            import kotlinx.coroutines.runBlocking
            import org.hamcrest.CoreMatchers.`is`
            import org.junit.Assert.assertThat
            import org.junit.Test

    2. Copy this test:

    TasksLocalDataSourceTest.kt
            // runBlocking is used here because of https://github.com/Kotlin/kotlinx.coroutines/issues/1204
            // TODO: Replace with runBlockingTest once issue is resolved
            @Test
            fun saveTask_retrievesTask() = runBlocking {
                // GIVEN - A new task saved in the database.
                val newTask = Task("title", "description", false)
                localDataSource.saveTask(newTask)

                // WHEN  - Task retrieved by ID.
                val result = localDataSource.getTask(newTask.id)

                // THEN - Same task is returned.
                assertThat(result.succeeded, `is`(true))
                result as Success
                assertThat(result.data.title, `is`("title"))
                assertThat(result.data.description, `is`("description"))
                assertThat(result.data.isCompleted, `is`(false))
            }

  This is very similar to your DAO test. Like the DAO test, this test:

    * Creates a task and inserts it into the database.

    * Retrieves the task using its id.

    * Asserts that that task was retrieved, and that all its properties
      match the inserted task.

  The only real difference from the analogous DAO test is that the local
  data source returns an instance of the sealed Result class, which is
  the format the repository expects. For example, this line here casts
  the result as a Success:

    TasksLocalDataSourceTest.kt

            assertThat(result.succeeded, `is`(true))
            result as Success

    3. Run your test!

Step 3: Write your own local data source test

  Now it's your turn.

    1. Copy the following code:

  TasksLocalDataSourceTest.kt
            @Test
            fun completeTask_retrievedTaskIsComplete(){
                // 1. Save a new active task in the local data source.

                // 2. Mark it as complete.

                // 3. Check that the task can be retrieved from the local data source and is complete.

            }

    2. Finish the code, referring to the saveTask_retrievesTask test you added previously, as needed.

    3. Run your test and confirm it passes!

The completed test is in the end_codelab_3 branch of the repository here, so that you can compare.
https://github.com/udacity/android-testing/blob/end_codelab_3/app/src/androidTest/java/com/example/android/architecture/blueprints/todoapp/data/source/local/TasksLocalDataSourceTest.kt
https://github.com/udacity/android-testing/tree/end_codelab_3


________________________________________________________________________________

________________________________________________________________________________

                  10. Idling Resources and End-to-End Testing
________________________________________________________________________________

                              NOTHING HERE
                              NOTHING HERE
                              NOTHING HERE
________________________________________________________________________________


________________________________________________________________________________

                    11. Counting Idling Resource
________________________________________________________________________________

  In this step, you'll create an Espresso idling resources to act as a
  synchronization mechanism for Espresso and your long running operations.
https://developer.android.com/training/testing/espresso/idling-resource

Step 1: Turn off animations

  If you haven't already, turn off animations.

    1. On your testing device (physical or emulated), go to Settings > Developer options.

    2. Disable these three settings:

      * Window animation scale

      * Transition animation scale

      * Animator duration scale

https://video.udacity-data.com/topher/2020/January/5e31b0fd_11.countingidlingresources1/11.countingidlingresources1.png

Step 2: Create TasksActivityTest

    1. Create a file and class called TasksActivityTest.kt in androidTest:
https://video.udacity-data.com/topher/2020/January/5e31b0fe_11.countingidlingresources2/11.countingidlingresources2.png

    2. Annotate the class with @RunWith(AndroidJUnit4::class) because you're
       using AndroidX test code.

    3. Annotate the class with @LargeTest, which signifies these are
       end-to-end tests, testing a large portion of the code.

    4. Create a property called repository which is a TasksRepository.

    5. Create a @Before method and initialize the repository using the
       ServiceLocator's provideTasksRepository method; use
       getApplicationContext to get the application context.

    6. In the @Before method, delete all the tasks in the repository, to ensure
       it's completely cleared out before each and every test run.

    7. Create an @After method that calls the ServiceLocator's
       resetRepository() method.

  When you're done, your code should look like:

    TasksActivityTest.kt
                @RunWith(AndroidJUnit4::class)
                @LargeTest
                class TasksActivityTest {

                    private lateinit var repository: TasksRepository

                    @Before
                    fun init() {
                        repository = ServiceLocator.provideTasksRepository(getApplicationContext())
                        runBlocking {
                            repository.deleteAllTasks()
                        }
                    }

                    @After
                    fun reset() {
                        ServiceLocator.resetRepository()
                    }
                }

What about ActiivtySenarioRule?

  Note that there is an ActivityScenarioRule which calls launch and close for you.
https://developer.android.com/reference/androidx/test/ext/junit/rules/ActivityScenarioRule

  As mentioned, any setup of the data state, such as adding tasks to the
  repository, must happen before ActivityScenario.launch() is called.
  Calling such additional setup code, such as saving tasks to the
  repository, is not currently supported by ActivityScenarioRule.
  Therefore, we choose not to use ActivityScenarioRule and instead
  manually call launch and close.

Step 3: Write an End-to-End Espresso Test

    1. Open TasksActivityTest.

    2. Inside the class, add the following skeleton code:

    TasksActivityTest.kt
              @Test
              fun editTask() = runBlocking {
                  // Set initial state.
                  repository.saveTask(Task("TITLE1", "DESCRIPTION"))

                  // Start up Tasks screen.
                  val activityScenario = ActivityScenario.launch(TasksActivity::class.java)


                  // Espresso code will go here.


                  // Make sure the activity is closed before resetting the db:
                  activityScenario.close().
              }

  This is the basic setup for any test involving an Activity. Between when you
  launch the ActivityScenario and close the ActivityScenario you can now
  write your Espresso code.

    3. Add the Espresso code as seen below:

    TasksActivityTest.kt
              @Test
              fun editTask() = runBlocking {

                  // Set initial state.
                  repository.saveTask(Task("TITLE1", "DESCRIPTION"))

                  // Start up Tasks screen.
                  val activityScenario = ActivityScenario.launch(TasksActivity::class.java)

                  // Click on the task on the list and verify that all the data is correct.
                  onView(withText("TITLE1")).perform(click())
                  onView(withId(R.id.task_detail_title_text)).check(matches(withText("TITLE1")))
                  onView(withId(R.id.task_detail_description_text)).check(matches(withText("DESCRIPTION")))
                  onView(withId(R.id.task_detail_complete_checkbox)).check(matches(not(isChecked())))

                  // Click on the edit button, edit, and save.
                  onView(withId(R.id.edit_task_fab)).perform(click())
                  onView(withId(R.id.add_task_title_edit_text)).perform(replaceText("NEW TITLE"))
                  onView(withId(R.id.add_task_description_edit_text)).perform(replaceText("NEW DESCRIPTION"))
                  onView(withId(R.id.save_task_fab)).perform(click())

                  // Verify task is displayed on screen in the task list.
                  onView(withText("NEW TITLE")).check(matches(isDisplayed()))
                  // Verify previous task is not displayed.
                  onView(withText("TITLE1")).check(doesNotExist())
                  // Make sure the activity is closed before resetting the db.
                  activityScenario.close()
              }

  Here are the imports if you need them:

    TasksActivityTest.kt
            import androidx.test.core.app.ActivityScenario
            import androidx.test.core.app.ApplicationProvider.getApplicationContext
            import androidx.test.espresso.Espresso.onView
            import androidx.test.espresso.action.ViewActions.click
            import androidx.test.espresso.action.ViewActions.replaceText
            import androidx.test.espresso.assertion.ViewAssertions.doesNotExist
            import androidx.test.espresso.assertion.ViewAssertions.matches
            import androidx.test.espresso.matcher.ViewMatchers.*
            import androidx.test.ext.junit.runners.AndroidJUnit4
            import androidx.test.filters.LargeTest
            import com.example.android.architecture.blueprints.todoapp.data.Task
            import com.example.android.architecture.blueprints.todoapp.data.source.TasksRepository
            import com.example.android.architecture.blueprints.todoapp.tasks.TasksActivity
            import kotlinx.coroutines.runBlocking
            import org.hamcrest.core.IsNot.not
            import org.junit.After
            import org.junit.Before
            import org.junit.Test
            import org.junit.runner.RunWith

    4. Run this test five times. Notice that the test is flaky, meaning
       sometimes it will pass, and sometimes it will fail:
https://video.udacity-data.com/topher/2020/January/5e31b0fe_11.countingidlingresources3/11.countingidlingresources3.png
https://video.udacity-data.com/topher/2020/January/5e31b0ff_11.countingidlingresources4/11.countingidlingresources4.png

Step 4: Add Idling Resource to your Gradle file

    1. Open your app's build.gradle file and add the Espresso idling resource library:

    app/build.gradle
                implementation "androidx.test.espresso:espresso-idling-resource:$espressoVersion"

    2. Also add the following option returnDefaultValues = true to testOptions.unitTests.

    app/build.gradle
                testOptions.unitTests {
                    includeAndroidResources = true
                    returnDefaultValues = true
                }

Step 5: Create an Idling Resource Singleton

  You will add two idling resources. One to deal with data binding
  synchronization for your views, and another to deal with the long
  running operation in your repository.

  You'll start with the idling resource related to long running repository operations.

    1. Create a new file called EspressoIdlingResource in app > java > main > util:

https://video.udacity-data.com/topher/2020/January/5e31b0ff_11.countingidlingresources5/11.countingidlingresources5.png

    2. Copy the following code:

    EspressoIdlingResource.kt

            object EspressoIdlingResource {

                private const val RESOURCE = "GLOBAL"

                @JvmField
                val countingIdlingResource = CountingIdlingResource(RESOURCE)

                fun increment() {
                    countingIdlingResource.increment()
                }

                fun decrement() {
                    if (!countingIdlingResource.isIdleNow) {
                        countingIdlingResource.decrement()
                    }
                }
            }

Step 6: Create wrapEspressoIdlingResource

    1. In the EspressoIdlingResource file, below the singleton you just
       created, add the following code for wrapEspressoIdlingResource:

    EspressoIdlingResource.kt
            inline fun <T> wrapEspressoIdlingResource(function: () -> T): T {
                // Espresso does not work well with coroutines yet. See
                // https://github.com/Kotlin/kotlinx.coroutines/issues/982
                EspressoIdlingResource.increment() // Set app as busy.
                return try {
                    function()
                } finally {
                    EspressoIdlingResource.decrement() // Set app as idle.
                }
            }

Step 7: Use wrapEspressoIdlingResource in DefaultTasksRepository

  Now you should wrap long running operations with wrapEspressoIdlingResource.
  The majority of these are in your DefaultTasksRepository.

    1. In your application code, open data > source > DefaultTasksRepository.

    2. Wrap all methods in DefaultTasksRepository with wrapEspressoIdlingResource

  Here's an example of wrapping the getTasks method:

    DefaultTasksRepository.kt
              override suspend fun getTasks(forceUpdate: Boolean): Result<List<Task>> {
                  wrapEspressoIdlingResource {
                      if (forceUpdate) {
                          try {
                              updateTasksFromRemoteDataSource()
                          } catch (ex: Exception) {
                              return Result.Error(ex)
                          }
                      }
                      return tasksLocalDataSource.getTasks()
                  }
              }

  The full code for DefaultTasksRepository with all the methods wrapped
  can be found here.
https://github.com/udacity/android-testing/blob/end_codelab_3/app/src/main/java/com/example/android/architecture/blueprints/todoapp/data/source/DefaultTasksRepository.kt

  It is unusual to have testing code in your application. To understand more
  about why and methods of removing idling resource code from your application
  production code, check out Android testing with Espresso’s Idling Resources
  and testing fidelity.
https://medium.com/androiddevelopers/android-testing-with-espressos-idling-resources-and-testing-fidelity-8b8647ed57f4

________________________________________________________________________________


________________________________________________________________________________

                  12. Databinding Idiling Resource
________________________________________________________________________________
