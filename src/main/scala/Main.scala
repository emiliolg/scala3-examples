
object Main:

  def main(args: Array[String]): Unit = 
    println(if args.length > 0 then args(0) else "No arguments")
  
    var i = 0
    while i < 10 do
      println(i)
      i += 1
    end while
    
    runExamples

  end main
  
  private def runExamples = 
    runExample("Trait Params")(TraitParams.test)
    runExample("Context Queries")(ContextQueries.test)
    runExample("Implied Instances")(ImpliedInstances.test)
    runExample("Conversion")(Conversion.test)
    runExample("Union Types")(UnionTypes.test)
    runExample("Intersection Types")(IntersectionTypes.test)
    runExample("Type Lambda")(TypeLambdas.test)
    runExample("Multiversal Equality")(MultiversalEquality.test)
    runExample("Auto Param Tupling")(AutoParamTupling.test)
    runExample("Structural Types")(StructuralTypes.test)
    runExample("Pattern Matching")(PatternMatching.test)
  end runExamples

  private def runExample(name: String)(f: => Unit) = 
    println(Console.MAGENTA + s"$name example:" + Console.RESET)
    f
    println()

end Main
