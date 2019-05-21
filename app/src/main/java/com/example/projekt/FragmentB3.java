package com.example.projekt;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class FragmentB3 extends Fragment{


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {




        View v = inflater.inflate(R.layout.fragment_b2, container, false);

        VideoView videov;
        MediaController mediaC = new MediaController(getActivity().getApplicationContext());
        videov = (VideoView) v.findViewById(R.id.video_view);


        /*String videopath = "android.resource://com.example.projekt/"+R.raw.video;*/
        String videopath = "@raw/video";
        Uri uri = Uri.parse(videopath);
        videov.setVideoURI(uri);
        videov.setMediaController(mediaC);
        mediaC.setAnchorView(videov);
        videov.start();


        return v;

/*VideoView videoView =   v.findViewById(R.id.video_view);
        String videoPath = "android.resource://com.example.projekt/"+R.raw.video;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(getActivity().getApplicationContext());


*/
    }


}
