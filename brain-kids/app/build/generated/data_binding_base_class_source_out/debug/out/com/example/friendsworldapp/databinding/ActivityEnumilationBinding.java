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
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.friendsworldapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityEnumilationBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout Answers;

  @NonNull
  public final Button buttonNo;

  @NonNull
  public final Button buttonYes;

  @NonNull
  public final CardView card;

  @NonNull
  public final ImageView imageBack;

  @NonNull
  public final ImageView imageEnumerationInfo;

  @NonNull
  public final TextView textHeaderClassificateon;

  @NonNull
  public final TextView textHeaderTimer;

  @NonNull
  public final TextView textInfoEnumilation;

  private ActivityEnumilationBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout Answers,
      @NonNull Button buttonNo, @NonNull Button buttonYes, @NonNull CardView card,
      @NonNull ImageView imageBack, @NonNull ImageView imageEnumerationInfo,
      @NonNull TextView textHeaderClassificateon, @NonNull TextView textHeaderTimer,
      @NonNull TextView textInfoEnumilation) {
    this.rootView = rootView;
    this.Answers = Answers;
    this.buttonNo = buttonNo;
    this.buttonYes = buttonYes;
    this.card = card;
    this.imageBack = imageBack;
    this.imageEnumerationInfo = imageEnumerationInfo;
    this.textHeaderClassificateon = textHeaderClassificateon;
    this.textHeaderTimer = textHeaderTimer;
    this.textInfoEnumilation = textInfoEnumilation;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityEnumilationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityEnumilationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_enumilation, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityEnumilationBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Answers;
      LinearLayout Answers = ViewBindings.findChildViewById(rootView, id);
      if (Answers == null) {
        break missingId;
      }

      id = R.id.buttonNo;
      Button buttonNo = ViewBindings.findChildViewById(rootView, id);
      if (buttonNo == null) {
        break missingId;
      }

      id = R.id.buttonYes;
      Button buttonYes = ViewBindings.findChildViewById(rootView, id);
      if (buttonYes == null) {
        break missingId;
      }

      id = R.id.card;
      CardView card = ViewBindings.findChildViewById(rootView, id);
      if (card == null) {
        break missingId;
      }

      id = R.id.imageBack;
      ImageView imageBack = ViewBindings.findChildViewById(rootView, id);
      if (imageBack == null) {
        break missingId;
      }

      id = R.id.imageEnumerationInfo;
      ImageView imageEnumerationInfo = ViewBindings.findChildViewById(rootView, id);
      if (imageEnumerationInfo == null) {
        break missingId;
      }

      id = R.id.textHeaderClassificateon;
      TextView textHeaderClassificateon = ViewBindings.findChildViewById(rootView, id);
      if (textHeaderClassificateon == null) {
        break missingId;
      }

      id = R.id.textHeaderTimer;
      TextView textHeaderTimer = ViewBindings.findChildViewById(rootView, id);
      if (textHeaderTimer == null) {
        break missingId;
      }

      id = R.id.textInfoEnumilation;
      TextView textInfoEnumilation = ViewBindings.findChildViewById(rootView, id);
      if (textInfoEnumilation == null) {
        break missingId;
      }

      return new ActivityEnumilationBinding((LinearLayout) rootView, Answers, buttonNo, buttonYes,
          card, imageBack, imageEnumerationInfo, textHeaderClassificateon, textHeaderTimer,
          textInfoEnumilation);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
