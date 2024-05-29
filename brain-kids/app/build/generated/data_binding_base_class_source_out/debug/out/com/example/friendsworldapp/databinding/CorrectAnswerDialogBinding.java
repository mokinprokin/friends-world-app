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
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.friendsworldapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CorrectAnswerDialogBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button buttonCorrect;

  @NonNull
  public final ImageView imageCorrect;

  @NonNull
  public final TextView textCorrect;

  private CorrectAnswerDialogBinding(@NonNull LinearLayout rootView, @NonNull Button buttonCorrect,
      @NonNull ImageView imageCorrect, @NonNull TextView textCorrect) {
    this.rootView = rootView;
    this.buttonCorrect = buttonCorrect;
    this.imageCorrect = imageCorrect;
    this.textCorrect = textCorrect;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CorrectAnswerDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CorrectAnswerDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.correct_answer_dialog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CorrectAnswerDialogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonCorrect;
      Button buttonCorrect = ViewBindings.findChildViewById(rootView, id);
      if (buttonCorrect == null) {
        break missingId;
      }

      id = R.id.imageCorrect;
      ImageView imageCorrect = ViewBindings.findChildViewById(rootView, id);
      if (imageCorrect == null) {
        break missingId;
      }

      id = R.id.textCorrect;
      TextView textCorrect = ViewBindings.findChildViewById(rootView, id);
      if (textCorrect == null) {
        break missingId;
      }

      return new CorrectAnswerDialogBinding((LinearLayout) rootView, buttonCorrect, imageCorrect,
          textCorrect);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
