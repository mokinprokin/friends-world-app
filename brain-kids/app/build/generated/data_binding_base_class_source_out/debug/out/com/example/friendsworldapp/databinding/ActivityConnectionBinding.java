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
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.friendsworldapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityConnectionBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button buttonCommin;

  @NonNull
  public final Button buttonConnect;

  @NonNull
  public final ImageView imageBack;

  @NonNull
  public final ImageView imageOppozition;

  @NonNull
  public final ImageView imageSimilar;

  private ActivityConnectionBinding(@NonNull LinearLayout rootView, @NonNull Button buttonCommin,
      @NonNull Button buttonConnect, @NonNull ImageView imageBack,
      @NonNull ImageView imageOppozition, @NonNull ImageView imageSimilar) {
    this.rootView = rootView;
    this.buttonCommin = buttonCommin;
    this.buttonConnect = buttonConnect;
    this.imageBack = imageBack;
    this.imageOppozition = imageOppozition;
    this.imageSimilar = imageSimilar;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityConnectionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityConnectionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_connection, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityConnectionBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonCommin;
      Button buttonCommin = ViewBindings.findChildViewById(rootView, id);
      if (buttonCommin == null) {
        break missingId;
      }

      id = R.id.buttonConnect;
      Button buttonConnect = ViewBindings.findChildViewById(rootView, id);
      if (buttonConnect == null) {
        break missingId;
      }

      id = R.id.imageBack;
      ImageView imageBack = ViewBindings.findChildViewById(rootView, id);
      if (imageBack == null) {
        break missingId;
      }

      id = R.id.imageOppozition;
      ImageView imageOppozition = ViewBindings.findChildViewById(rootView, id);
      if (imageOppozition == null) {
        break missingId;
      }

      id = R.id.imageSimilar;
      ImageView imageSimilar = ViewBindings.findChildViewById(rootView, id);
      if (imageSimilar == null) {
        break missingId;
      }

      return new ActivityConnectionBinding((LinearLayout) rootView, buttonCommin, buttonConnect,
          imageBack, imageOppozition, imageSimilar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
