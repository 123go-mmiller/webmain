package org.dominokit.domino.componentcase.client.ui.views;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLDivElement;
import org.dominokit.domino.ui.icons.Icons;
import org.dominokit.domino.ui.style.Styles;
import org.dominokit.domino.ui.utils.BaseDominoElement;

import static org.jboss.gwt.elemento.core.Elements.div;
import static org.jboss.gwt.elemento.core.Elements.span;

public class LinkToSourceCode extends BaseDominoElement<HTMLDivElement, LinkToSourceCode> {

    private HTMLDivElement element = div().css("open-source", "bg-theme", Styles.default_shadow)
            .add(Icons.ALL.code())
            .add(span().textContent("Source code"))
            .asElement();

    public static LinkToSourceCode create(String moduleName, Class impl) {
        return new LinkToSourceCode(moduleName, impl);
    }

    public LinkToSourceCode(String moduleName, Class impl) {
        String fullClassName = impl.getCanonicalName().replace(".", "/") + ".java";
        element.addEventListener("click", evt -> {
            DomGlobal.window.open("https://github.com/DominoKit/domino-ui-demo/blob/master/" + moduleName +
                    "/src/main/java/" + fullClassName);
        });
    }

    @Override
    public HTMLDivElement asElement() {
        return element;
    }
}