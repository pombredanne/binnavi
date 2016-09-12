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
package com.google.security.zynamics.binnavi.ZyGraph.Menus.Actions;

import com.google.security.zynamics.binnavi.disassembly.COperandTreeNode;
import com.google.security.zynamics.binnavi.disassembly.OperandDisplayStyle;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

/**
 * Action class for displaying operands.
 */
public class CDisplayOperandAction extends AbstractAction {
  /**
   * The operand to display.
   */
  private final COperandTreeNode treeNode;

  /**
   * The display style for an operand.
   */
  private final OperandDisplayStyle displayStyle;

  /**
   * Creates a new action object.
   *
   * @param treeNode The operand to display.
   */
  public CDisplayOperandAction(final COperandTreeNode treeNode,
      final OperandDisplayStyle displayStyle, final String displayName) {
    super(displayName);
    this.treeNode = treeNode;
    this.displayStyle = displayStyle;
  }

  @Override
  public void actionPerformed(final ActionEvent event) {
    treeNode.setDisplayStyle(displayStyle);
  }
}
