

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

`TODO 4.10`
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

Step 1: Add Gradle Dependencies

    1. Add the following gradle dependencies:

              app/build.gradle
                  // Dependencies for Android instrumented unit tests
                  androidTestImplementation "junit:junit:$junitVersion"
                  androidTestImplementation "org.jetbrains.kotlinx:kotlinx-coroutines-test:$coroutinesVersion"

                  // Testing code should not be included in the main code.
                  // Once https://issuetracker.google.com/128612536 is fixed this can be fixed.

                  implementation "androidx.fragment:fragment-testing:$fragmentVersion"
                  implementation "androidx.test:core:$androidXTestCoreVersion"

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
