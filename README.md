# Groovy Closure Unexpected Return Value Exception

This repository demonstrates a subtle issue in Groovy related to closures returning values.  When a closure returns a value and the calling method doesn't explicitly handle it, a runtime exception might occur, depending on the Groovy version and how the closure is used.

The `bug.groovy` file shows the problematic code, and `bugSolution.groovy` presents a solution.

## How to Reproduce

1. Clone this repository.
2. Run `bug.groovy` using a Groovy interpreter (e.g., `groovy bug.groovy`).

You will observe an unexpected `MissingMethodException` or similar behavior.

## Solution

The solution involves ensuring the method receiving the closure either ignores the return value or explicitly handles it.

## Additional Notes

This issue highlights a difference in how Groovy handles closure returns compared to some other languages. Understanding this behavior is crucial to avoid unexpected runtime errors in Groovy applications.