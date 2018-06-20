package braingalore.yogamandira;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by s92 on 5/4/2017.
 */

    public class NotificationsFragment extends Fragment {

        private RecyclerView recyclerView;
        private RecyclerView.Adapter mAdapter;
        private RecyclerView.LayoutManager layoutManager;

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            /** Inflating the layout for this fragment **/
            View v = inflater.inflate(R.layout.notification_fragment, null);
            recyclerView = (RecyclerView) v.findViewById(R.id.my_recycler_view);
            // use this setting to
            // improve performance if you know that changes
            // in content do not change the layout size
            // of the RecyclerView
            recyclerView.setHasFixedSize(true);
            DividerItemDecoration horizontalDecoration = new DividerItemDecoration(recyclerView.getContext(),
                    DividerItemDecoration.VERTICAL);
            Drawable horizontalDivider = ContextCompat.getDrawable(getActivity(), R.drawable.horizontal_divider);
            horizontalDecoration.setDrawable(horizontalDivider);
            recyclerView.addItemDecoration(horizontalDecoration);
            // use a linear layout manager
            layoutManager = new LinearLayoutManager(getActivity());
            recyclerView.setLayoutManager(layoutManager);

            List<String> notificationList = new ArrayList<>();
            notificationList.add("Sample1");
            notificationList.add("Sample2");
            mAdapter = new NotificationListAdapter(notificationList);
            recyclerView.setAdapter(mAdapter);
            return v;
        }
    }