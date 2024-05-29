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

public final class ActivitySaleBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button buttonSale;

  @NonNull
  public final ImageView imageBack;

  @NonNull
  public final TextView textSaleLessions;

  @NonNull
  public final TextView textSaleLogin;

  private ActivitySaleBinding(@NonNull LinearLayout rootView, @NonNull Button buttonSale,
      @NonNull ImageView imageBack, @NonNull TextView textSaleLessions,
      @NonNull TextView textSaleLogin) {
    this.rootView = rootView;
    this.buttonSale = buttonSale;
    this.imageBack = imageBack;
    this.textSaleLessions = textSaleLessions;
    this.textSaleLogin = textSaleLogin;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySaleBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySaleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_sale, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySaleBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonSale;
      Button buttonSale = ViewBindings.findChildViewById(rootView, id);
      if (buttonSale == null) {
        break missingId;
      }

      id = R.id.imageBack;
      ImageView imageBack = ViewBindings.findChildViewById(rootView, id);
      if (imageBack == null) {
        break missingId;
      }

      id = R.id.textSaleLessions;
      TextView textSaleLessions = ViewBindings.findChildViewById(rootView, id);
      if (textSaleLessions == null) {
        break missingId;
      }

      id = R.id.textSaleLogin;
      TextView textSaleLogin = ViewBindings.findChildViewById(rootView, id);
      if (textSaleLogin == null) {
        break missingId;
      }

      return new ActivitySaleBinding((LinearLayout) rootView, buttonSale, imageBack,
          textSaleLessions, textSaleLogin);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
