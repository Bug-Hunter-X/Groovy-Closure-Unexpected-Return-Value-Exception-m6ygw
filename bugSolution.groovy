```groovy
def methodWithClosure(closure) {
  println "Executing closure..."
  closure() //Return value is ignored
}

def methodWithClosure2(closure) {
  println "Executing closure..."
  def result = closure() //Return value is captured and used
  println "Closure returned: "+ result
}

methodWithClosure { println "Inside closure" }
methodWithClosure { println "Inside closure"; return 10 }

methodWithClosure2 { println "Inside closure"; return 10 }
```