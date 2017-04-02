package com.example.pwess.time2kill.cardstream;

import com.example.pwess.time2kill.cardstream.Card;

import java.util.HashSet;

/**
 * A struct object that holds the state of a {@link CardStreamFragment}.
 */
public class CardStreamState {
    protected Card[] visibleCards;
    protected Card[] hiddenCards;
    protected HashSet<String> dismissibleCards;
    protected String shownTag;

    protected CardStreamState(Card[] visible, Card[] hidden, HashSet<String> dismissible, String shownTag) {
        visibleCards = visible;
        hiddenCards = hidden;
        dismissibleCards = dismissible;
        this.shownTag = shownTag;
    }

}
