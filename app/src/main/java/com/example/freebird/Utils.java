package com.example.freebird;


import com.example.freebird.presentation.ui.downloads.model.CardModel;
import com.example.freebird.presentation.ui.home.model.BookmarkItem;
import com.example.freebird.presentation.ui.home.model.RecentModel;
import com.example.freebird.presentation.ui.home.model.SideMenuModel;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    List<CardModel> cardModel;
    List<BookmarkItem> bookmarkItemList;
    List<RecentModel> recentModelList;
    List<SideMenuModel> sideMenuModels;

    public List<CardModel> getDownloadCardList(int size ) {
        cardModel = new ArrayList<>();
        for (int i = 0; i <= size; i++) {
            cardModel.add(new CardModel("Movie title", R.drawable.img));
        }
        return cardModel;
    }

    public List<BookmarkItem> getBookmarkItemList() {
        bookmarkItemList = new ArrayList<>();
            bookmarkItemList.add(new BookmarkItem( R.drawable.face_book,"FaceBook"));
            bookmarkItemList.add(new BookmarkItem( R.drawable.whatsapp,"WhatsApp"));
            bookmarkItemList.add(new BookmarkItem( R.drawable.linkedin,"LinkedIn"));
            bookmarkItemList.add(new BookmarkItem( R.drawable.yahoo,"Yahoo"));
            bookmarkItemList.add(new BookmarkItem( R.drawable.yahoo,"Yahoo"));
            bookmarkItemList.add(new BookmarkItem( R.drawable.add,"Add"));

        return bookmarkItemList;
    }

    public List<RecentModel> getRecentItemList() {
        recentModelList = new ArrayList<>();
        for (int i = 0; i <=3; i++) {
            recentModelList.add(new RecentModel(R.drawable.youtube_red,"https_www_youtube_com_watch....."));
        }
        return recentModelList;
    }
    public List<SideMenuModel> getSidemenutemList() {
        sideMenuModels = new ArrayList<>();
        sideMenuModels.add(new SideMenuModel(R.drawable.add_menu,"New Tab"));
        sideMenuModels.add(new SideMenuModel(R.drawable.remove__menu,"Remove Ads"));
        sideMenuModels.add(new SideMenuModel(R.drawable.how__menu,"How to download?"));
        sideMenuModels.add(new SideMenuModel(R.drawable.bookmark__menu,"Add to bookmark"));
        sideMenuModels.add(new SideMenuModel(R.drawable.copy_menu,"Copy Link"));
        sideMenuModels.add(new SideMenuModel(R.drawable.bookbookmark_menu,"Bookmarks"));
        sideMenuModels.add(new SideMenuModel(R.drawable.history_menu,"History"));
        sideMenuModels.add(new SideMenuModel(R.drawable.share_menu,"Share URL"));
        sideMenuModels.add(new SideMenuModel(R.drawable.desktop__menu,"Desktop Site"));
        sideMenuModels.add(new SideMenuModel(R.drawable.setting_menu,"Settings"));

        return sideMenuModels;
    }
}
