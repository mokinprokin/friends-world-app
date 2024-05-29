// Generated by view binder compiler. Do not edit!
package com.example.friendsworldapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.friendsworldapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityComprasionBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button buttonNext;

  @NonNull
  public final ImageView imageBack;

  @NonNull
  public final ImageView imgAccept1;

  @NonNull
  public final ImageView imgAccept2;

  @NonNull
  public final ImageView imgAccept3;

  @NonNull
  public final ImageView imgAccept4;

  @NonNull
  public final RecyclerView itemsItem1;

  @NonNull
  public final RecyclerView itemsItem2;

  @NonNull
  public final TextView textHeaderComprasion;

  @NonNull
  public final TextView textHeaderTimer;

  private ActivityComprasionBinding(@NonNull LinearLayout rootView, @NonNull Button buttonNext,
      @NonNull ImageView imageBack, @NonNull ImageView imgAccept1, @NonNull ImageView imgAccept2,
      @NonNull ImageView imgAccept3, @NonNull ImageView imgAccept4,
      @NonNull RecyclerView itemsItem1, @NonNull RecyclerView itemsItem2,
      @NonNull TextView textHeaderComprasion, @NonNull TextView textHeaderTimer) {
    this.rootView = rootView;
    this.buttonNext = buttonNext;
    this.imageBack = imageBack;
    this.imgAccept1 = imgAccept1;
    this.imgAccept2 = imgAccept2;
    this.imgAccept3 = imgAccept3;
    this.imgAccept4 = imgAccept4;
    this.itemsItem1 = itemsItem1;
    this.itemsItem2 = itemsItem2;
    this.textHeaderComprasion = textHeaderComprasion;
    this.textHeaderTimer = textHeaderTimer;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityComprasionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityComprasionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_comprasion, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityComprasionBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonNext;
      Button buttonNext = ViewBindings.findChildViewById(rootView, id);
      if (buttonNext == null) {
        break missingId;
      }

      id = R.id.imageBack;
      ImageView imageBack = ViewBindings.findChildViewById(rootView, id);
      if (imageBack == null) {
        break missingId;
      }

      id = R.id.img_accept1;
      ImageView imgAccept1 = ViewBindings.findChildViewById(rootView, id);
      if (imgAccept1 == null) {
        break missingId;
      }

      id = R.id.img_accept2;
      ImageView imgAccept2 = ViewBindings.findChildViewById(rootView, id);
      if (imgAccept2 == null) {
        break missingId;
      }

      id = R.id.img_accept3;
      ImageView imgAccept3 = ViewBindings.findChildViewById(rootView, id);
      if (imgAccept3 == null) {
        break missingId;
      }

      id = R.id.img_accept4;
      ImageView imgAccept4 = ViewBindings.findChildViewById(rootView, id);
      if (imgAccept4 == null) {
        break missingId;
      }

      id = R.id.items_item1;
      RecyclerView itemsItem1 = ViewBindings.findChildViewById(rootView, id);
      if (itemsItem1 == null) {
        break missingId;
      }

      id = R.id.items_item2;
      RecyclerView itemsItem2 = ViewBindings.findChildViewById(rootView, id);
      if (itemsItem2 == null) {
        break missingId;
      }

      id = R.id.textHeaderComprasion;
      TextView textHeaderComprasion = ViewBindings.findChildViewById(rootView, id);
      if (textHeaderComprasion == null) {
        break missingId;
      }

      id = R.id.textHeaderTimer;
      TextView textHeaderTimer = ViewBindings.findChildViewById(rootView, id);
      if (textHeaderTimer == null) {
        break missingId;
      }

      return new ActivityComprasionBinding((LinearLayout) rootView, buttonNext, imageBack,
          imgAccept1, imgAccept2, imgAccept3, imgAccept4, itemsItem1, itemsItem2,
          textHeaderComprasion, textHeaderTimer);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
