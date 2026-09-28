package com.example.calculadora;

import static androidx.test.espresso.Espresso.*;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.*;

import androidx.test.espresso.Espresso;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;

public class CalculadoraSumaUITest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testSumaSimpleUI() {
        onView(withId(R.id.etOper1)).perform(typeText("5"));
        onView(withId(R.id.etOper2)).perform(typeText("40"));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.btnCalcula)).perform(click());
        onView(withId(R.id.txtRes)).check(matches(withText("9.0")));
    }
}
