/*!
 * PENTAHO CORPORATION PROPRIETARY AND CONFIDENTIAL
 *
 * Copyright 2002 - 2014 Pentaho Corporation (Pentaho). All rights reserved.
 *
 * NOTICE: All information including source code contained herein is, and
 * remains the sole property of Pentaho and its licensors. The intellectual
 * and technical concepts contained herein are proprietary and confidential
 * to, and are trade secrets of Pentaho and may be covered by U.S. and foreign
 * patents, or patents in process, and are protected by trade secret and
 * copyright laws. The receipt or possession of this source code and/or related
 * information does not convey or imply any rights to reproduce, disclose or
 * distribute its contents, or to manufacture, use, or sell anything that it
 * may describe, in whole or in part. Any reproduction, modification, distribution,
 * or public display of this information without the express written authorization
 * from Pentaho is strictly prohibited and in violation of applicable laws and
 * international treaties. Access to the source code contained herein is strictly
 * prohibited to anyone except those individuals and entities who have executed
 * confidentiality and non-disclosure agreements or other agreements with Pentaho,
 * explicitly covering such access.
 */

package com.pentaho.profiling.api.datasource;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by bryan on 8/11/14.
 */
public class DataSourceReferenceTest {
  @Test
  public void testNoArgConstructorSetsNullValues() {
    DataSourceReference dataSourceReference = new DataSourceReference();
    assertEquals( null, dataSourceReference.getId() );
    assertEquals( null, dataSourceReference.getDataSourceProvider() );
  }

  @Test
  public void testTwoArgConstructorSetsValues() {
    String id = "VALUE_1";
    String dataSourceProvider = "VALUE_2";
    DataSourceReference dataSourceReference = new DataSourceReference( id, dataSourceProvider );
    assertEquals( id, dataSourceReference.getId() );
    assertEquals( dataSourceProvider, dataSourceReference.getDataSourceProvider() );
  }

  @Test
  public void testSetIdRoundTrip() {
    String id = "VALUE_1";
    DataSourceReference dataSourceReference = new DataSourceReference();
    dataSourceReference.setId( id );
    assertEquals( id, dataSourceReference.getId() );
  }

  @Test
  public void testSetDataSourceProviderRoundTrip() {
    String dataSourceId = "VALUE_1";
    DataSourceReference dataSourceReference = new DataSourceReference();
    dataSourceReference.setDataSourceProvider( dataSourceId );
    assertEquals( dataSourceId, dataSourceReference.getDataSourceProvider() );
  }

  @Test
  public void testSetId() {
    String id = "VALUE_1";
    DataSourceReference dataSourceReference = new DataSourceReference();
    dataSourceReference.setId( id );
    assertEquals( id, dataSourceReference.getId() );
  }

  @Test
  public void testSetDataSourceProvider() {
    String dataSourceProvider = "VALUE_1";
    DataSourceReference dataSourceReference = new DataSourceReference();
    dataSourceReference.setDataSourceProvider( dataSourceProvider );
    assertEquals( dataSourceProvider, dataSourceReference.getDataSourceProvider() );
  }
}