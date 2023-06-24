package com.r2ha.blackjack;

import com.r2ha.blackjack.adapter.in.console.ConsoleCard;
import com.r2ha.blackjack.domain.Card;
import com.r2ha.blackjack.domain.Rank;
import com.r2ha.blackjack.domain.Suit;
import com.r2ha.blackjack.domain.Card;
import com.r2ha.blackjack.domain.Rank;
import com.r2ha.blackjack.domain.Suit;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CardDisplayTest {

    @Test
    void displaysTenCard() {
        Card card = new Card(Suit.HEARTS, Rank.TEN);

        String output = ConsoleCard.display(card);

        assertThat(output)
                .isEqualTo("[31m┌─────────┐[1B[11D│10       │[1B[11D│         │[1B[11D│    ♥    │[1B[11D│         │[1B[11D│       10│[1B[11D└─────────┘");
    }

    @Test
    void displaysFiveCard() {
        Card card = new Card(Suit.SPADES, Rank.FIVE);

        String output = ConsoleCard.display(card);

        assertThat(output)
                .isEqualTo("[30m┌─────────┐[1B[11D│5        │[1B[11D│         │[1B[11D│    ♠    │[1B[11D│         │[1B[11D│        5│[1B[11D└─────────┘");
    }
}
