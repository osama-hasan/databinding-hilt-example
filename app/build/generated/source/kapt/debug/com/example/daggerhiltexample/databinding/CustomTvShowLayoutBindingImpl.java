package com.example.daggerhiltexample.databinding;
import com.example.daggerhiltexample.BR;
import com.example.daggerhiltexample.model.TvShow;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class CustomTvShowLayoutBindingImpl extends CustomTvShowLayoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    @NonNull
    private final android.widget.TextView mboundView4;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public CustomTvShowLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private CustomTvShowLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            );
        this.imageView.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.textView.setTag(null);
        this.textView2.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.tvShow == variableId) {
            setTvShow((TvShow) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTvShow(@Nullable TvShow TvShow) {
        this.mTvShow = TvShow;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.tvShow);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        TvShow tvShow = mTvShow;
        java.lang.String tvShowName = null;
        java.lang.String tvShowCoverImage = null;
        java.lang.String tvShowStartDate = null;
        java.lang.String tvShowNetwork = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (tvShow != null) {
                    // read tvShow.name
                    tvShowName = tvShow.getName();
                    // read tvShow.coverImage
                    tvShowCoverImage = tvShow.getCoverImage();
                    // read tvShow.startDate
                    tvShowStartDate = tvShow.getStartDate();
                    // read tvShow.network
                    tvShowNetwork = tvShow.getNetwork();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.example.daggerhiltexample.BindingAdapterKt.loadImage(this.imageView, tvShowCoverImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, tvShowNetwork);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView, tvShowName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView2, tvShowStartDate);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): tvShow
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}