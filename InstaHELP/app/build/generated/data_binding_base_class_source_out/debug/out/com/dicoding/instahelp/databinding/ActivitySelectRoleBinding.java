// Generated by view binder compiler. Do not edit!
package com.dicoding.instahelp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dicoding.instahelp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySelectRoleBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout cardInstansi;

  @NonNull
  public final LinearLayout cardMasyarakat;

  @NonNull
  public final View toggleInstansi;

  @NonNull
  public final View toggleMasyarakat;

  @NonNull
  public final TextView tvHeaderSubtitle;

  @NonNull
  public final TextView tvHeaderTitle;

  private ActivitySelectRoleBinding(@NonNull LinearLayout rootView,
      @NonNull LinearLayout cardInstansi, @NonNull LinearLayout cardMasyarakat,
      @NonNull View toggleInstansi, @NonNull View toggleMasyarakat,
      @NonNull TextView tvHeaderSubtitle, @NonNull TextView tvHeaderTitle) {
    this.rootView = rootView;
    this.cardInstansi = cardInstansi;
    this.cardMasyarakat = cardMasyarakat;
    this.toggleInstansi = toggleInstansi;
    this.toggleMasyarakat = toggleMasyarakat;
    this.tvHeaderSubtitle = tvHeaderSubtitle;
    this.tvHeaderTitle = tvHeaderTitle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySelectRoleBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySelectRoleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_select_role, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySelectRoleBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.card_instansi;
      LinearLayout cardInstansi = ViewBindings.findChildViewById(rootView, id);
      if (cardInstansi == null) {
        break missingId;
      }

      id = R.id.card_masyarakat;
      LinearLayout cardMasyarakat = ViewBindings.findChildViewById(rootView, id);
      if (cardMasyarakat == null) {
        break missingId;
      }

      id = R.id.toggle_instansi;
      View toggleInstansi = ViewBindings.findChildViewById(rootView, id);
      if (toggleInstansi == null) {
        break missingId;
      }

      id = R.id.toggle_masyarakat;
      View toggleMasyarakat = ViewBindings.findChildViewById(rootView, id);
      if (toggleMasyarakat == null) {
        break missingId;
      }

      id = R.id.tv_header_subtitle;
      TextView tvHeaderSubtitle = ViewBindings.findChildViewById(rootView, id);
      if (tvHeaderSubtitle == null) {
        break missingId;
      }

      id = R.id.tv_header_title;
      TextView tvHeaderTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvHeaderTitle == null) {
        break missingId;
      }

      return new ActivitySelectRoleBinding((LinearLayout) rootView, cardInstansi, cardMasyarakat,
          toggleInstansi, toggleMasyarakat, tvHeaderSubtitle, tvHeaderTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
