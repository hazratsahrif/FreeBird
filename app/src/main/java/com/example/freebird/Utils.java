package com.example.freebird;


import java.util.ArrayList;
import java.util.List;

public class Utils {
    List<com.example.freebird.model.CardModel> cardModel;

    public List<com.example.freebird.model.CardModel> getDownloadCardList(int size ) {
        cardModel = new ArrayList<>();

        for (int i = 0; i <= size; i++) {
            cardModel.add(new com.example.freebird.model.CardModel("Movie title", R.drawable.img));

        }
        return cardModel;
    }
}
