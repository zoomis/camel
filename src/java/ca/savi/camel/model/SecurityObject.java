// Copyright (C) 2012, The SAVI Project.
package ca.savi.camel.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for SecurityObject complex type.
 * <p>
 * @author Eliot J. Kang <eliot@savinetwork.ca>
 * @version 0.4
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityObject", propOrder = { "string" })
public class SecurityObject {
  @XmlElement(required = true)
  protected String string;

  /**
   * Gets the value of the string property.
   * @return possible object is {@link String }
   */
  public String getString() {
    return string;
  }

  /**
   * Sets the value of the string property.
   * @param value allowed object is {@link String }
   */
  public void setString(String value) {
    this.string = value;
  }
}
