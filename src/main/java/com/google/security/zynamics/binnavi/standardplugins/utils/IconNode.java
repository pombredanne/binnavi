/*
Copyright 2011-2016 Google Inc. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package com.google.security.zynamics.binnavi.standardplugins.utils;

import javax.swing.Icon;
import javax.swing.tree.DefaultMutableTreeNode;

public class IconNode extends DefaultMutableTreeNode {

  protected Icon icon;
  protected String iconName;

  public IconNode() {
    this(null);
  }

  public IconNode(final Object userObject) {
    this(userObject, true, null);
  }

  public IconNode(final Object userObject, final boolean allowsChildren, final Icon icon) {
    super(userObject, allowsChildren);
    this.icon = icon;
  }

  public final Icon getIcon() {
    return icon;
  }

  public final String getIconName() {
    if (iconName != null) {
      return iconName;
    } else {
      if (userObject == null) {
        return null;
      } else {
        final String str = userObject.toString();
        int index = str.lastIndexOf(".");
        if (index != -1) {
          return str.substring(++index);
        } else {
          return null;
        }
      }
    }
  }

  public final void setIcon(final Icon icon) {
    this.icon = icon;
  }

  public final void setIconName(final String name) {
    iconName = name;
  }

}
