package com.jesse.ohunelo.presentation.viewmodels

import androidx.lifecycle.ViewModel
import com.jesse.ohunelo.R
import com.jesse.ohunelo.data.model.Nutrition
import com.jesse.ohunelo.data.model.Recipe
import com.jesse.ohunelo.data.network.models.*
import com.jesse.ohunelo.presentation.uistates.HomeUiState
import com.jesse.ohunelo.util.UiDrawable
import com.jesse.ohunelo.util.UiText
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import java.util.Calendar
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(): ViewModel() {

    private val _homeUiStateFlow: MutableStateFlow<HomeUiState> = MutableStateFlow(HomeUiState())
    val homeUiStateFlow: StateFlow<HomeUiState> get() = _homeUiStateFlow.asStateFlow()

    // todo: this acts a source of recipe data for now and would be removed soon
   private var recipes = listOf<Recipe>()

    // todo: when data layer is properly setup changes will be made here
    init {
        updateGreeting()
        recipes =  listOf(
            Recipe(
                id = 1,
                analyzedInstructions = listOf(
                    AnalyzedInstructions(name = "Tortilla Chip", steps = listOf(Step(number = 1, step = "Preheat oven to 350", ingredients = listOf(), equipment = listOf()), Step(number = 2, step = "In a large bowl beat the butter with an electric mixer on medium speed for 30 seconds.", ingredients = listOf(), equipment = listOf()), Step(number = 3, step = "Add brown sugar, maple syrup, baking soda, cinnamon, ginger and salt. Beat until combined.", ingredients = listOf(), equipment = listOf()), Step(number = 4, step = "Beat in egg, applesauce and vanilla. Beat in as much flour as you can with mixer. Stir in remaining flour, carrots, raisins, walnuts just until combined.", ingredients = listOf(), equipment = listOf()))),
                    AnalyzedInstructions(name = "", steps = listOf(Step(number = 1, step = "Preheat oven to 350", ingredients = listOf(), equipment = listOf()))),
                ),
                cookingMinutes = 20,
                creditsText = "creditsText",
                extendedIngredients = listOf(ExtendedIngredient(id = 1034053,
                    aisle = "Oil, Vinegar, Salad Dressing", consistency = "LIQUID",
                    name = "extra virgin olive oil", nameClean = "extra virgin olive oil",
                    original = "1-2 tbsp extra virgin olive oil", originalName = "extra virgin olive oil",
                    amount = 1.0, unit = "tbsp", meta = listOf(),
                    measures = Measures(us = Us(amount = 1.0, unitLong = "Tbsp", unitShort = "Tbsp"),
                        metric = Metric(amount = 1.0, unitShort = "Tbsp", unitLong = "Tbsp")), image = "olive-oil.jpg"
                ), ExtendedIngredient(id = 1034053,
                    aisle = "Oil, Vinegar, Salad Dressing", consistency = "LIQUID",
                    name = "extra virgin olive oil", nameClean = "extra virgin olive oil",
                    original = "1-2 tbsp extra virgin olive oil", originalName = "extra virgin olive oil",
                    amount = 1.0, unit = "tbsp", meta = listOf(),
                    measures = Measures(us = Us(amount = 1.0, unitLong = "Tbsp", unitShort = "Tbsp"),
                        metric = Metric(amount = 1.0, unitShort = "Tbsp", unitLong = "Tbsp")), image = "olive-oil.jpg"
                ), ExtendedIngredient(id = 1034053,
                    aisle = "Oil, Vinegar, Salad Dressing", consistency = "LIQUID",
                    name = "extra virgin olive oil", nameClean = "extra virgin olive oil",
                    original = "1-2 tbsp extra virgin olive oil", originalName = "extra virgin olive oil",
                    amount = 1.0, unit = "tbsp", meta = listOf(),
                    measures = Measures(us = Us(amount = 1.0, unitLong = "Tbsp", unitShort = "Tbsp"),
                        metric = Metric(amount = 1.0, unitShort = "Tbsp", unitLong = "Tbsp")), image = "olive-oil.jpg"
                )),
                healthScore = 5,
                image = "image",
                imageType = "imageType",
                instructions = "instructions",
                preparationMinutes = 20,
                pricePerServing = 100.00,
                readyInMinutes = 20,
                servings = 2,
                sourceName = "Anthony Joshua",
                title = "Asian Chickpea Lettuce Wraps",
                weightWatcherSmartPoints = 33,
                summary = "This is a very long text that needs to be truncated. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                nutrition = Nutrition(1, calories = "316", carbs = "49g", fat = "12g", protein = "3g",
                    expires = 1L)
            ),
            Recipe(
                id = 1,
                analyzedInstructions = listOf(),
                cookingMinutes = 20,
                creditsText = "creditsText",
                extendedIngredients = listOf(),
                healthScore = 5,
                image = "image",
                imageType = "imageType",
                instructions = "instructions",
                preparationMinutes = 20,
                pricePerServing = 100.00,
                readyInMinutes = 20,
                servings = 2,
                sourceName = "Anthony Joshua",
                title = "Asian Chickpea Lettuce Wraps",
                weightWatcherSmartPoints = 33,
                summary = "This is a very long text that needs to be truncated. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                nutrition = Nutrition(1, calories = "316", carbs = "49g", fat = "12g", protein = "3g",
                    expires = 1L)
            ),
            Recipe(
                id = 1,
                analyzedInstructions = listOf(),
                cookingMinutes = 20,
                creditsText = "creditsText",
                extendedIngredients = listOf(),
                healthScore = 5,
                image = "image",
                imageType = "imageType",
                instructions = "instructions",
                preparationMinutes = 20,
                pricePerServing = 100.00,
                readyInMinutes = 20,
                servings = 2,
                sourceName = "Anthony Joshua",
                title = "Asian Chickpea Lettuce Wraps",
                weightWatcherSmartPoints = 33,
                summary = "This is a very long text that needs to be truncated. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                nutrition = Nutrition(1, calories = "316", carbs = "49g", fat = "12g", protein = "3g",
                    expires = 1L)
            ),
            Recipe(
                id = 1,
                analyzedInstructions = listOf(),
                cookingMinutes = 20,
                creditsText = "creditsText",
                extendedIngredients = listOf(),
                healthScore = 5,
                image = "image",
                imageType = "imageType",
                instructions = "instructions",
                preparationMinutes = 20,
                pricePerServing = 100.00,
                readyInMinutes = 20,
                servings = 2,
                sourceName = "Anthony Joshua",
                title = "Asian Chickpea Lettuce Wraps",
                weightWatcherSmartPoints = 33,
                summary = "This is a very long text that needs to be truncated. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                nutrition = Nutrition(1, calories = "316", carbs = "49g", fat = "12g", protein = "3g",
                    expires = 1L)
            ),
            Recipe(
                id = 1,
                analyzedInstructions = listOf(),
                cookingMinutes = 20,
                creditsText = "creditsText",
                extendedIngredients = listOf(),
                healthScore = 5,
                image = "image",
                imageType = "imageType",
                instructions = "instructions",
                preparationMinutes = 20,
                pricePerServing = 100.00,
                readyInMinutes = 20,
                servings = 2,
                sourceName = "Anthony Joshua",
                title = "Asian Chickpea Lettuce Wraps",
                weightWatcherSmartPoints = 33,
                summary = "This is a very long text that needs to be truncated. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                nutrition = Nutrition(1, calories = "316", carbs = "49g", fat = "12g", protein = "3g",
                    expires = 1L)
            ),
            Recipe(
                id = 1,
                analyzedInstructions = listOf(),
                cookingMinutes = 20,
                creditsText = "creditsText",
                extendedIngredients = listOf(),
                healthScore = 5,
                image = "image",
                imageType = "imageType",
                instructions = "instructions",
                preparationMinutes = 20,
                pricePerServing = 100.00,
                readyInMinutes = 20,
                servings = 2,
                sourceName = "Anthony Joshua",
                title = "Asian Chickpea Lettuce Wraps",
                weightWatcherSmartPoints = 33,
                summary = "This is a very long text that needs to be truncated. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                nutrition = Nutrition(1, calories = "316", carbs = "49g", fat = "12g", protein = "3g",
                    expires = 1L)
            ),
            Recipe(
                id = 1,
                analyzedInstructions = listOf(),
                cookingMinutes = 20,
                creditsText = "creditsText",
                extendedIngredients = listOf(),
                healthScore = 5,
                image = "image",
                imageType = "imageType",
                instructions = "instructions",
                preparationMinutes = 20,
                pricePerServing = 100.00,
                readyInMinutes = 20,
                servings = 2,
                sourceName = "Anthony Joshua",
                title = "Asian Chickpea Lettuce Wraps",
                weightWatcherSmartPoints = 33,
                summary = "This is a very long text that needs to be truncated. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                nutrition = Nutrition(1, calories = "316", carbs = "49g", fat = "12g", protein = "3g",
                    expires = 1L)
            ),
            Recipe(
                id = 1,
                analyzedInstructions = listOf(),
                cookingMinutes = 20,
                creditsText = "creditsText",
                extendedIngredients = listOf(),
                healthScore = 5,
                image = "image",
                imageType = "imageType",
                instructions = "instructions",
                preparationMinutes = 20,
                pricePerServing = 100.00,
                readyInMinutes = 20,
                servings = 2,
                sourceName = "Anthony Joshua",
                title = "Asian Chickpea Lettuce Wraps",
                weightWatcherSmartPoints = 33,
                summary = "This is a very long text that needs to be truncated. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                nutrition = Nutrition(1, calories = "316", carbs = "49g", fat = "12g", protein = "3g",
                    expires = 1L)
            ),
            Recipe(
                id = 1,
                analyzedInstructions = listOf(),
                cookingMinutes = 20,
                creditsText = "creditsText",
                extendedIngredients = listOf(),
                healthScore = 5,
                image = "image",
                imageType = "imageType",
                instructions = "instructions",
                preparationMinutes = 20,
                pricePerServing = 100.00,
                readyInMinutes = 20,
                servings = 2,
                sourceName = "Anthony Joshua",
                title = "Asian Chickpea Lettuce Wraps",
                weightWatcherSmartPoints = 33,
                summary = "This is a very long text that needs to be truncated. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                nutrition = Nutrition(1, calories = "316", carbs = "49g", fat = "12g", protein = "3g",
                    expires = 1L)
            ),
            Recipe(
                id = 1,
                analyzedInstructions = listOf(),
                cookingMinutes = 20,
                creditsText = "creditsText",
                extendedIngredients = listOf(),
                healthScore = 5,
                image = "image",
                imageType = "imageType",
                instructions = "instructions",
                preparationMinutes = 20,
                pricePerServing = 100.00,
                readyInMinutes = 20,
                servings = 2,
                sourceName = "Anthony Joshua",
                title = "Asian Chickpea Lettuce Wraps",
                weightWatcherSmartPoints = 33,
                summary = "This is a very long text that needs to be truncated. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                nutrition = Nutrition(1, calories = "316", carbs = "49g", fat = "12g", protein = "3g",
                    expires = 1L)
            ),
        )
        _homeUiStateFlow.update {
            state ->
            state.copy(randomRecipes = recipes, recipesByCategory = recipes)
        }
    }

    fun updateGreeting(){
        val currentHour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY)

        when(currentHour){
            in 0..11 -> {_homeUiStateFlow.update { it.copy(userGreetingText = UiText.StringResource(
                R.string.good_morning), userGreetingIcon = UiDrawable(R.drawable.sun_icon)
            ) }}
            in 12..16 -> {_homeUiStateFlow.update { it.copy(userGreetingText =
            UiText.StringResource(R.string.good_afternoon),
                userGreetingIcon = UiDrawable(R.drawable.sun_icon)
            ) }}
            in 17..21 -> {_homeUiStateFlow.update { it.copy(userGreetingText =
            UiText.StringResource(R.string.good_evening),
                userGreetingIcon = UiDrawable(R.drawable.moon_icon)
            ) }}
            else -> {_homeUiStateFlow.update { it.copy(userGreetingText =
            UiText.StringResource(R.string.good_evening),
                userGreetingIcon = UiDrawable(R.drawable.moon_icon)) }}
        }

    }
}