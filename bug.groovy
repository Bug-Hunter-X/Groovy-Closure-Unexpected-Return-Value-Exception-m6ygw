```groovy
def methodWithClosure(closure) {
  println "Executing closure..."
  closure()
}

methodWithClosure { println "Inside closure" }

//This will cause the error
methodWithClosure { println "Inside closure"; return 10 }
```