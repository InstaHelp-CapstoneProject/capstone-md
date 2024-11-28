// Generated by view binder compiler. Do not edit!
package com.dicoding.instahelp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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

public final class ItemAmbulanceBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView ambulanceImage;

  @NonNull
  public final TextView ambulanceName;

  @NonNull
  public final TextView availability;

  @NonNull
  public final TextView driverName;

  @NonNull
  public final TextView plateNumber;

  private ItemAmbulanceBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView ambulanceImage, @NonNull TextView ambulanceName,
      @NonNull TextView availability, @NonNull TextView driverName, @NonNull TextView plateNumber) {
    this.rootView = rootView;
    this.ambulanceImage = ambulanceImage;
    this.ambulanceName = ambulanceName;
    this.availability = availability;
    this.driverName = driverName;
    this.plateNumber = plateNumber;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemAmbulanceBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemAmbulanceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_ambulance, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemAmbulanceBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ambulance_image;
      ImageView ambulanceImage = ViewBindings.findChildViewById(rootView, id);
      if (ambulanceImage == null) {
        break missingId;
      }

      id = R.id.ambulance_name;
      TextView ambulanceName = ViewBindings.findChildViewById(rootView, id);
      if (ambulanceName == null) {
        break missingId;
      }

      id = R.id.availability;
      TextView availability = ViewBindings.findChildViewById(rootView, id);
      if (availability == null) {
        break missingId;
      }

      id = R.id.driver_name;
      TextView driverName = ViewBindings.findChildViewById(rootView, id);
      if (driverName == null) {
        break missingId;
      }

      id = R.id.plate_number;
      TextView plateNumber = ViewBindings.findChildViewById(rootView, id);
      if (plateNumber == null) {
        break missingId;
      }

      return new ItemAmbulanceBinding((ConstraintLayout) rootView, ambulanceImage, ambulanceName,
          availability, driverName, plateNumber);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}