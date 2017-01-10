package ladsoft.com.popularmoviesapp.presenter;


import android.content.Context;
import android.net.Uri;

import java.util.List;

import ladsoft.com.popularmoviesapp.model.MovieReview;
import ladsoft.com.popularmoviesapp.model.MovieVideo;

public interface MovieDetailsPresenter<T> {
    enum ErrorType {
        DATA_LOAD_ERROR,
        VIDEO_DATA_LOAD_ERROR,
        VIDEO_LINK_PARSE_ERROR,
        REVIEW_DATA_LOAD_ERROR
    }

    interface Callback<T> {
        void onDataLoaded(T movie);
        void onVideoListLoaded(List<MovieVideo> videos);
        void onReviewListLoaded(List<MovieReview> reviews);
        void onVideoLaunch(Uri videoUri);
        void onFavoriteSuccessful();
        void onError(ErrorType errorType);
    }

    void loadData(T movie);
    void loadVideos();
    void loadReviews();
    void onMovieVideoSelected(Context context, MovieVideo video);
    String getPosterPath();
    void setFavorite();
}
