// Generated by view binder compiler. Do not edit!
package com.dicoding.instahelp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dicoding.instahelp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySignUpResidentBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final Button btnBuatAkun;

  @NonNull
  public final EditText etAlamat;

  @NonNull
  public final EditText etEmail;

  @NonNull
  public final EditText etKataSandi;

  @NonNull
  public final EditText etKonfirmasiKataSandi;

  @NonNull
  public final EditText etNama;

  @NonNull
  public final EditText etNik;

  @NonNull
  public final EditText etNomorTelepon;

  @NonNull
  public final EditText etTanggalLahir;

  @NonNull
  public final EditText etTempatLahir;

  @NonNull
  public final ImageView ivBack;

  @NonNull
  public final ImageView ivLogo;

  @NonNull
  public final Spinner spJenisKelamin;

  @NonNull
  public final TextView tvLogin;

  @NonNull
  public final TextView tvTitle;

  private ActivitySignUpResidentBinding(@NonNull ScrollView rootView, @NonNull Button btnBuatAkun,
      @NonNull EditText etAlamat, @NonNull EditText etEmail, @NonNull EditText etKataSandi,
      @NonNull EditText etKonfirmasiKataSandi, @NonNull EditText etNama, @NonNull EditText etNik,
      @NonNull EditText etNomorTelepon, @NonNull EditText etTanggalLahir,
      @NonNull EditText etTempatLahir, @NonNull ImageView ivBack, @NonNull ImageView ivLogo,
      @NonNull Spinner spJenisKelamin, @NonNull TextView tvLogin, @NonNull TextView tvTitle) {
    this.rootView = rootView;
    this.btnBuatAkun = btnBuatAkun;
    this.etAlamat = etAlamat;
    this.etEmail = etEmail;
    this.etKataSandi = etKataSandi;
    this.etKonfirmasiKataSandi = etKonfirmasiKataSandi;
    this.etNama = etNama;
    this.etNik = etNik;
    this.etNomorTelepon = etNomorTelepon;
    this.etTanggalLahir = etTanggalLahir;
    this.etTempatLahir = etTempatLahir;
    this.ivBack = ivBack;
    this.ivLogo = ivLogo;
    this.spJenisKelamin = spJenisKelamin;
    this.tvLogin = tvLogin;
    this.tvTitle = tvTitle;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySignUpResidentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySignUpResidentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_sign_up_resident, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySignUpResidentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_buat_akun;
      Button btnBuatAkun = ViewBindings.findChildViewById(rootView, id);
      if (btnBuatAkun == null) {
        break missingId;
      }

      id = R.id.et_alamat;
      EditText etAlamat = ViewBindings.findChildViewById(rootView, id);
      if (etAlamat == null) {
        break missingId;
      }

      id = R.id.et_email;
      EditText etEmail = ViewBindings.findChildViewById(rootView, id);
      if (etEmail == null) {
        break missingId;
      }

      id = R.id.et_kata_sandi;
      EditText etKataSandi = ViewBindings.findChildViewById(rootView, id);
      if (etKataSandi == null) {
        break missingId;
      }

      id = R.id.et_konfirmasi_kata_sandi;
      EditText etKonfirmasiKataSandi = ViewBindings.findChildViewById(rootView, id);
      if (etKonfirmasiKataSandi == null) {
        break missingId;
      }

      id = R.id.et_nama;
      EditText etNama = ViewBindings.findChildViewById(rootView, id);
      if (etNama == null) {
        break missingId;
      }

      id = R.id.et_nik;
      EditText etNik = ViewBindings.findChildViewById(rootView, id);
      if (etNik == null) {
        break missingId;
      }

      id = R.id.et_nomor_telepon;
      EditText etNomorTelepon = ViewBindings.findChildViewById(rootView, id);
      if (etNomorTelepon == null) {
        break missingId;
      }

      id = R.id.et_tanggal_lahir;
      EditText etTanggalLahir = ViewBindings.findChildViewById(rootView, id);
      if (etTanggalLahir == null) {
        break missingId;
      }

      id = R.id.et_tempat_lahir;
      EditText etTempatLahir = ViewBindings.findChildViewById(rootView, id);
      if (etTempatLahir == null) {
        break missingId;
      }

      id = R.id.iv_back;
      ImageView ivBack = ViewBindings.findChildViewById(rootView, id);
      if (ivBack == null) {
        break missingId;
      }

      id = R.id.iv_logo;
      ImageView ivLogo = ViewBindings.findChildViewById(rootView, id);
      if (ivLogo == null) {
        break missingId;
      }

      id = R.id.sp_jenis_kelamin;
      Spinner spJenisKelamin = ViewBindings.findChildViewById(rootView, id);
      if (spJenisKelamin == null) {
        break missingId;
      }

      id = R.id.tv_login;
      TextView tvLogin = ViewBindings.findChildViewById(rootView, id);
      if (tvLogin == null) {
        break missingId;
      }

      id = R.id.tv_title;
      TextView tvTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvTitle == null) {
        break missingId;
      }

      return new ActivitySignUpResidentBinding((ScrollView) rootView, btnBuatAkun, etAlamat,
          etEmail, etKataSandi, etKonfirmasiKataSandi, etNama, etNik, etNomorTelepon,
          etTanggalLahir, etTempatLahir, ivBack, ivLogo, spJenisKelamin, tvLogin, tvTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
