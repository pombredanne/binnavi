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
package com.google.security.zynamics.binnavi.Gui.CriteriaDialog.Conditions.Visibillity;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

/**
 * Panel shown in the criteria dialog when Visibility state criteria nodes are selected.
 */
public final class CVisibilityCriteriumPanel extends JPanel {
  /**
   * The criterium edited in this panel.
   */
  private final CVisibilityCriterium visibilityCriterium;

  /**
   * Allows the user to select the visibility state.
   */
  private final JComboBox<VisibilityState> visibilityStateBox = new JComboBox<VisibilityState>();

  /**
   * Updates the GUI on user input.
   */
  private final InternalComboboxListener visibilityStateBoxListener =
      new InternalComboboxListener();

  /**
   * Creates a new panel object.
   *
   * @param criterium The criterium edited in this panel.
   */
  public CVisibilityCriteriumPanel(final CVisibilityCriterium criterium) {
    super(new BorderLayout());
    visibilityCriterium = criterium;
    visibilityStateBox.addActionListener(visibilityStateBoxListener);
    initPanel();
  }

  /**
   * Creates the GUI of the panel.
   */
  private void initPanel() {
    final JPanel mainPanel = new JPanel(new BorderLayout());
    mainPanel.setBorder(new TitledBorder("Edit Visibility Condition"));

    final JPanel comboPanel = new JPanel(new BorderLayout());
    comboPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

    visibilityStateBox.addItem(VisibilityState.VISIBLE);
    visibilityStateBox.addItem(VisibilityState.UNVISIBLE);

    comboPanel.add(visibilityStateBox, BorderLayout.CENTER);

    mainPanel.add(comboPanel, BorderLayout.NORTH);

    add(mainPanel, BorderLayout.CENTER);
  }

  /**
   * Frees allocated resources.
   */
  public void dispose() {
    visibilityStateBox.removeActionListener(visibilityStateBoxListener);
  }

  /**
   * Returns the visibility state selected by the user.
   *
   * @return The visibility state selected by the user.
   */
  public VisibilityState getVisibilityState() {
    return (VisibilityState) visibilityStateBox.getSelectedItem();
  }

  /**
   * Updates the GUI on user input.
   */
  private class InternalComboboxListener implements ActionListener {
    @Override
    public void actionPerformed(final ActionEvent event) {
      visibilityCriterium.notifyListeners();
    }
  }
}
