// Generated by view binder compiler. Do not edit!
package com.example.safedrive.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.safedrive.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityUploadBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnsubmitupload;

  @NonNull
  public final AppCompatEditText etuploadname;

  @NonNull
  public final AppCompatEditText etuploadnametwo;

  private ActivityUploadBinding(@NonNull LinearLayout rootView, @NonNull Button btnsubmitupload,
      @NonNull AppCompatEditText etuploadname, @NonNull AppCompatEditText etuploadnametwo) {
    this.rootView = rootView;
    this.btnsubmitupload = btnsubmitupload;
    this.etuploadname = etuploadname;
    this.etuploadnametwo = etuploadnametwo;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityUploadBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityUploadBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_upload, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityUploadBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnsubmitupload;
      Button btnsubmitupload = ViewBindings.findChildViewById(rootView, id);
      if (btnsubmitupload == null) {
        break missingId;
      }

      id = R.id.etuploadname;
      AppCompatEditText etuploadname = ViewBindings.findChildViewById(rootView, id);
      if (etuploadname == null) {
        break missingId;
      }

      id = R.id.etuploadnametwo;
      AppCompatEditText etuploadnametwo = ViewBindings.findChildViewById(rootView, id);
      if (etuploadnametwo == null) {
        break missingId;
      }

      return new ActivityUploadBinding((LinearLayout) rootView, btnsubmitupload, etuploadname,
          etuploadnametwo);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
