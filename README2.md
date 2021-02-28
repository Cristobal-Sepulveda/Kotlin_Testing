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

              class StatisticsUtilsTest {

                  @Test
                  fun getActiveAndCompletedStats_noCompleted_returnsHundredZero() {

                      // Create an active tasks (the false makes this active)
                      val tasks = listOf<Task>(
                          Task("title", "desc", isCompleted = false)
                      )
                      // Call our function
                      val result = getActiveAndCompletedStats(tasks)

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

________________________________________________________________________________

                      9. Write Your First Test Continued
________________________________________________________________________________
