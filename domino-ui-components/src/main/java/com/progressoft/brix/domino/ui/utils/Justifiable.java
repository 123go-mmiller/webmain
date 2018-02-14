package com.progressoft.brix.domino.ui.utils;

import elemental2.dom.HTMLElement;
import org.jboss.gwt.elemento.core.IsElement;

public interface Justifiable extends IsElement<HTMLElement> {
    HTMLElement justify();

    void addJustifyHandler(JustifyHandler handler);

    interface JustifyHandler {
        void onJustifiy(HTMLElement element);
    }
}
