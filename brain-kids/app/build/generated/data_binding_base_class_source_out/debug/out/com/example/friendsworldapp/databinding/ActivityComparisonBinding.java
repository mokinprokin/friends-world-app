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

public final class ActivityComparisonBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button buttonNext;

  @NonNull
  public final ImageView imageBack;

  @NonNull
  public final RecyclerView itemsAnimals;

  @NonNull
  public final TextView textHeaderComprasion;

  private ActivityComparisonBinding(@NonNull LinearLayout rootView, @NonNull Button buttonNext,
      @NonNull ImageView imageBack, @NonNull RecyclerView itemsAnimals,
      @NonNull TextView textHeaderComprasion) {
    this.rootView = rootView;
    this.buttonNext = buttonNext;
    this.imageBack = imageBack;
    this.itemsAnimals = itemsAnimals;
    this.textHeaderComprasion = textHeaderComprasion;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityComparisonBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityComparisonBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_comparison, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityComparisonBinding bind(@NonNull View rootView) {
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

      id = R.id.items_animals;
      RecyclerView itemsAnimals = ViewBindings.findChildViewById(rootView, id);
      if (itemsAnimals == null) {
        break missingId;
      }

      id = R.id.textHeaderComprasion;
      TextView textHeaderComprasion = ViewBindings.findChildViewById(rootView, id);
      if (textHeaderComprasion == null) {
        break missingId;
      }

      return new ActivityComparisonBinding((LinearLayout) rootView, buttonNext, imageBack,
          itemsAnimals, textHeaderComprasion);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
