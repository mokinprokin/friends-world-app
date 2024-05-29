// Generated by view binder compiler. Do not edit!
package com.example.friendsworldapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.friendsworldapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCrossfordBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button buttonNext;

  @NonNull
  public final RecyclerView crossford1;

  @NonNull
  public final RecyclerView crossford2;

  @NonNull
  public final RecyclerView crossford3;

  @NonNull
  public final ImageView imageBack;

  private ActivityCrossfordBinding(@NonNull LinearLayout rootView, @NonNull Button buttonNext,
      @NonNull RecyclerView crossford1, @NonNull RecyclerView crossford2,
      @NonNull RecyclerView crossford3, @NonNull ImageView imageBack) {
    this.rootView = rootView;
    this.buttonNext = buttonNext;
    this.crossford1 = crossford1;
    this.crossford2 = crossford2;
    this.crossford3 = crossford3;
    this.imageBack = imageBack;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCrossfordBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCrossfordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_crossford, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCrossfordBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonNext;
      Button buttonNext = ViewBindings.findChildViewById(rootView, id);
      if (buttonNext == null) {
        break missingId;
      }

      id = R.id.crossford1;
      RecyclerView crossford1 = ViewBindings.findChildViewById(rootView, id);
      if (crossford1 == null) {
        break missingId;
      }

      id = R.id.crossford2;
      RecyclerView crossford2 = ViewBindings.findChildViewById(rootView, id);
      if (crossford2 == null) {
        break missingId;
      }

      id = R.id.crossford3;
      RecyclerView crossford3 = ViewBindings.findChildViewById(rootView, id);
      if (crossford3 == null) {
        break missingId;
      }

      id = R.id.imageBack;
      ImageView imageBack = ViewBindings.findChildViewById(rootView, id);
      if (imageBack == null) {
        break missingId;
      }

      return new ActivityCrossfordBinding((LinearLayout) rootView, buttonNext, crossford1,
          crossford2, crossford3, imageBack);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
