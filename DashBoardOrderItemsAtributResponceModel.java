package com.eighteenthtechnology.myapplication.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Sunil on 5/10/2017.
 */

public class DashBoardOrderItemsAtributResponceModel implements Parcelable {

    public static final Creator<DashBoardOrderItemsAtributResponceModel> CREATOR = new Creator<DashBoardOrderItemsAtributResponceModel>() {
        @Override
        public DashBoardOrderItemsAtributResponceModel createFromParcel(Parcel source) {
            return new DashBoardOrderItemsAtributResponceModel(source);
        }

        @Override
        public DashBoardOrderItemsAtributResponceModel[] newArray(int size) {
            return new DashBoardOrderItemsAtributResponceModel[size];
        }
    };

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DashBoardOrderItemsAtributResponceModel() {
    }


    protected DashBoardOrderItemsAtributResponceModel(Parcel in) {
        this.name = in.readString();

    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);

    }
}
