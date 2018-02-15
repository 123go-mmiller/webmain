package com.progressoft.brix.domino.buttons.client.presenters;

import com.progressoft.brix.domino.api.client.annotations.Presenter;
import com.progressoft.brix.domino.api.client.mvp.presenter.BaseClientPresenter;
import com.progressoft.brix.domino.api.shared.extension.Content;
import com.progressoft.brix.domino.buttons.client.views.ButtonsView;
import com.progressoft.brix.domino.componentcase.shared.extension.ComponentCase;
import com.progressoft.brix.domino.components.shared.extension.ComponentsContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Presenter
public class DefaultButtonsPresenter extends BaseClientPresenter<ButtonsView> implements ButtonsPresenter {

    private static final Logger LOGGER = LoggerFactory.getLogger(DefaultButtonsPresenter.class);

    @Override
    public void contributeToComponentsModule(ComponentsContext context) {
        context.getComponentCaseContext().addComponentCase(new ComponentCase() {
            @Override
            public String getHistoryToken() {
                return "components/buttons";
            }

            @Override
            public String getMenuPath() {
                return "Components/Buttons";
            }

            @Override
            public void showIn(Content content) {
                view.showIn(content);
            }
        });
    }
}