package com.example.tests;


import org.example.models.Employer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;


public class EmployerTest {

  private Employer employer;


  @BeforeEach
  void setUp () {

    System.out.println("Before each test method");
  }


  @AfterEach
  void turnDown () {

    System.out.println("After each test method");
  }


  @Test
  void testToString () {

    employer = new Employer(
        "0;John;Smith;25;Google;01/01/2010;10/10/2011;Microsoft;23/1/2012;10/10/2012;Apple;01/01/2014;10/10/2015");
    assertThat(employer).isNotNull()
        .hasToString(
            "Employer{id0firstName='John', lastName='Smith', age ='25', firstCompany='Google', firstCompanyStartDate='01/01/2010', firstCompanyLastDate='10/10/2011', secondCompany='Microsoft', secondCompanyStartDate='23/1/2012', secondCompanyLastDate='10/10/2012'}");
  }


  @Test
  void testFormatError () {

    assertThatExceptionOfType(IllegalArgumentException.class)
        .isThrownBy(() -> new Employer("0;John;Smith;ROFL"))
        .withMessage("For input string: \"ROFL\"");
  }
}
