## TDD Assignment – Calculator & DateChecker

A small Java project I built using TDD with JUnit 5. For every feature I wrote the test first, watched it fail, then wrote just enough code to make it pass.

## How to run the tests

In IntelliJ, right-click src/test/java and choose Run All Tests. Or in the terminal, run mvn test.

## Calculator

Has sum, subtract, multiply, divide, and isEven. Divide drops the remainder, so 7 / 2 = 3. Dividing by zero throws an ArithmeticException.

## DateChecker

has31Days tells you if a month has 31 days. It returns true for January, March, May, July, August, October, and December. It returns false for April, June, September, and November. February also returns false since it only has 28 or 29 days. If you pass in null, it throws an IllegalArgumentException.

## Reflection

Writing the test first made me think about what each method should do before coding it. Seeing a test fail first showed me the test was actually working.

Some tests passed right away. The April test passed because my first version only said yes to January, so everything else was already false. The divide by zero test passed because Java already throws an error for that.

The parameterized test was the most useful one. It failed for March and the other 31-day months, which made me write the real logic. The null test also failed at first, so I added a null check.

Refactoring was easy because the tests told me right away if I broke something. TDD felt slow for simple methods, but it made each step clear and easy to follow.