package org.javaeffective.chapter02.item02;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.Test;

public class NutritionFactsTest {

	@Test
	public void mustCreateANutritionFactsWithAllAtrributes() {
		
		
		NutritionFacts nutritionFacts = new NutritionFacts.Builder(100, 15)
		.calories(510)
		.carbohydrate(54)
		.sodium(70)
		.fat(40)
		.build();
		
		
		assertThat(nutritionFacts.getServingsSize(), equalTo(100));
		assertThat(nutritionFacts.getServings(), equalTo(15));
		assertThat(nutritionFacts.getCalories(), equalTo(510));
		assertThat(nutritionFacts.getCarbohydrate(), equalTo(54));
		assertThat(nutritionFacts.getSodium(), equalTo(70));
		assertThat(nutritionFacts.getFat(), equalTo(40));
		
		
		
	}

	@Test
	public void mustCreateANutritionFactsWithRequiredParameters() {
		
		
		NutritionFacts nutritionFacts = new NutritionFacts.Builder(90, 45)
				.build();
		
		
		assertThat(nutritionFacts.getServingsSize(), equalTo(90));
		assertThat(nutritionFacts.getServings(), equalTo(45));
		assertThat(nutritionFacts.getCalories(), equalTo(0));
		assertThat(nutritionFacts.getCarbohydrate(), equalTo(0));
		assertThat(nutritionFacts.getSodium(), equalTo(0));
		assertThat(nutritionFacts.getFat(), equalTo(0));
		
		
		
	}

}
