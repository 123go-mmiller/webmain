package com.progressoft.brix.domino.cards.client.views;

import com.progressoft.brix.domino.api.client.mvp.view.View;
import com.progressoft.brix.domino.api.shared.extension.Content;

public interface CardsView extends View{
    void showIn(Content content);
}