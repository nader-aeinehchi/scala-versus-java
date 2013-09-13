package org.naderica.whyscala.builder.scala

object NutritionFactsTest {
  def main(args: Array[String]) {
    val nutritionFacts1 = NutritionFacts(10, 20).copy(calories = 2000).copy(carbohydrate = 130)
    println(nutritionFacts1)

    val nutritionFacts2 = NutritionFacts(10, 20, carbohydrate = 130).copy(calories = 2000)
    println(nutritionFacts2)

    val nutritionFacts3 = NutritionFacts(carbohydrate = 130, servingSize = 10, servings = 20).copy(calories = 2000)
    println(nutritionFacts3)

    //The following does not compile
    //    val nutritionFacts4 = NutritionFacts(10)

    //If you only call the constructor.
    val nutritionFacts4 = NutritionFacts(10, 20)
    println(nutritionFacts4)
  }
}

/**
 * This class is immutable.  Some of the fields have default values.  You can call a constructor or a method with default values in any order.
 * See the example.
 */
case class NutritionFacts(servingSize: Integer, servings: Integer, calories: Integer = 0,
  fat: Integer = 0, carbohydrate: Integer = 0, sodium: Integer = 0)