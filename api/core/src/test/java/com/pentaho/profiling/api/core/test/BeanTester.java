package com.pentaho.profiling.api.core.test;

import org.junit.Assume;
import org.junit.Test;

import static com.google.code.beanmatchers.BeanMatchers.hasValidBeanConstructor;
import static com.google.code.beanmatchers.BeanMatchers.hasValidBeanEquals;
import static com.google.code.beanmatchers.BeanMatchers.hasValidBeanHashCode;
import static com.google.code.beanmatchers.BeanMatchers.hasValidBeanToString;
import static com.google.code.beanmatchers.BeanMatchers.hasValidGettersAndSetters;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by bryan on 1/9/15.
 */
public class BeanTester {
  private Class<?> clazz;
  private boolean testHasValidBeanConstructor;
  private boolean testHasValidGettersAndSetters;
  private boolean testHasValidBeanHashCode;
  private boolean testHasValidBeanEquals;
  private boolean testHasValidBeanToString;

  public BeanTester( Class<?> clazz ) {
    this( clazz, true, true, true, true, true );
  }

  public BeanTester( Class<?> clazz, boolean testHasValidBeanConstructor, boolean testHasValidGettersAndSetters,
                     boolean testHasValidBeanHashCode, boolean testHasValidBeanEquals,
                     boolean testHasValidBeanToString ) {
    this.clazz = clazz;
    this.testHasValidBeanConstructor = testHasValidBeanConstructor;
    this.testHasValidGettersAndSetters = testHasValidGettersAndSetters;
    this.testHasValidBeanHashCode = testHasValidBeanHashCode;
    this.testHasValidBeanEquals = testHasValidBeanEquals;
    this.testHasValidBeanToString = testHasValidBeanToString;
  }

  @Test
  public void testHasValidBeanConstructor() {
    Assume.assumeTrue( "Skipping hasValidBeanConstructor", testHasValidBeanConstructor );
    assertThat( clazz, hasValidBeanConstructor() );
  }

  @Test
  public void testHasValidGettersAndSetters() {
    Assume.assumeTrue( "Skipping hasValidGettersAndSetters", testHasValidGettersAndSetters );
    assertThat( clazz, hasValidGettersAndSetters() );
  }

  @Test
  public void testHasValidBeanHashCode() {
    Assume.assumeTrue( "Skipping testHasValidBeanHashCode", testHasValidBeanHashCode );
    assertThat( clazz, hasValidBeanHashCode() );
  }

  @Test
  public void testHasValidBeanEquals() {
    Assume.assumeTrue( "Skipping hasValidBeanEquals", testHasValidBeanEquals );
    assertThat( clazz, hasValidBeanEquals() );
  }

  @Test
  public void testHasValidBeanToString() {
    Assume.assumeTrue( "Skipping hasValidBeanToString", testHasValidBeanToString );
    assertThat( clazz, hasValidBeanToString() );
  }
}