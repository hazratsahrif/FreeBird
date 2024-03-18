package com.example.freebird;


import com.example.freebird.presentation.ui.downloads.model.CardModel;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    List<CardModel> cardModel;

    public List<CardModel> getDownloadCardList(int size ) {
        cardModel = new ArrayList<>();

        for (int i = 0; i <= size; i++) {
            cardModel.add(new CardModel("Movie title", R.drawable.img));

        }
        return cardModel;
    }
}
