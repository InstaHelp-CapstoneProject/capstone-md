// Generated by view binder compiler. Do not edit!
package com.dicoding.instahelp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dicoding.instahelp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityForgetPasswordBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView appName;

  @NonNull
  public final ImageView backButton;

  @NonNull
  public final EditText emailOrPhoneInput;

  @NonNull
  public final ImageView logo;

  @NonNull
  public final LinearLayout logoAndName;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final Button submitButton;

  @NonNull
  public final TextView titleText;

  private ActivityForgetPasswordBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView appName, @NonNull ImageView backButton, @NonNull EditText emailOrPhoneInput,
      @NonNull ImageView logo, @NonNull LinearLayout logoAndName, @NonNull ConstraintLayout main,
      @NonNull Button submitButton, @NonNull TextView titleText) {
    this.rootView = rootView;
    this.appName = appName;
    this.backButton = backButton;
    this.emailOrPhoneInput = emailOrPhoneInput;
    this.logo = logo;
    this.logoAndName = logoAndName;
    this.main = main;
    this.submitButton = submitButton;
    this.titleText = titleText;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityForgetPasswordBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityForgetPasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_forget_password, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityForgetPasswordBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.app_name;
      TextView appName = ViewBindings.findChildViewById(rootView, id);
      if (appName == null) {
        break missingId;
      }

      id = R.id.back_button;
      ImageView backButton = ViewBindings.findChildViewById(rootView, id);
      if (backButton == null) {
        break missingId;
      }

      id = R.id.email_or_phone_input;
      EditText emailOrPhoneInput = ViewBindings.findChildViewById(rootView, id);
      if (emailOrPhoneInput == null) {
        break missingId;
      }

      id = R.id.logo;
      ImageView logo = ViewBindings.findChildViewById(rootView, id);
      if (logo == null) {
        break missingId;
      }

      id = R.id.logo_and_name;
      LinearLayout logoAndName = ViewBindings.findChildViewById(rootView, id);
      if (logoAndName == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.submit_button;
      Button submitButton = ViewBindings.findChildViewById(rootView, id);
      if (submitButton == null) {
        break missingId;
      }

      id = R.id.title_text;
      TextView titleText = ViewBindings.findChildViewById(rootView, id);
      if (titleText == null) {
        break missingId;
      }

      return new ActivityForgetPasswordBinding((ConstraintLayout) rootView, appName, backButton,
          emailOrPhoneInput, logo, logoAndName, main, submitButton, titleText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
