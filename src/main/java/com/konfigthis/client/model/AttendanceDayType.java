/*
 * Requisition
 * Here's our story,  It all began with the frustration of using software that sucks. Prior to starting Keka, our core team was a 100 person business that needed an easy to use software for managing employees. We looked everywhere and all we found were software that was lousy and hard to use. We felt SME businesses in India deserved something better. Something awesome actually!  Thus emerged Keka!
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets AttendanceDayType
 */
@JsonAdapter(AttendanceDayType.Adapter.class)public enum AttendanceDayType {
  
  NUMBER_0(0),
  
  NUMBER_1(1),
  
  NUMBER_2(2),
  
  NUMBER_3(3),
  
  NUMBER_4(4);

  private Integer value;

  AttendanceDayType(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AttendanceDayType fromValue(Integer value) {
    for (AttendanceDayType b : AttendanceDayType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AttendanceDayType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AttendanceDayType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AttendanceDayType read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return AttendanceDayType.fromValue(value);
    }
  }
}
