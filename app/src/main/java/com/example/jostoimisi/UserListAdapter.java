package com.example.jostoimisi;

import android.content.Context;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class UserListAdapter extends RecyclerView.Adapter<UserViewHolder>{

    private Context context;
    private ArrayList<User> users;

    public UserListAdapter(Context context, ArrayList<User> users) {
        this.context = context;
        this.users = users;
    }


    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new UserViewHolder(LayoutInflater.from(context).inflate(R.layout.user_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        holder.userFirstName.setText(users.get(position).getFirstName());
        holder.userLastName.setText(users.get(position).getLastName());
        holder.userEmail.setText(users.get(position).getEmail());
        holder.userDegreeProgram.setText(users.get(position).getDegreeProgram());
        holder.userImage.setImageResource(users.get(position).getImage());

        holder.completedDegreesContainer.removeAllViews();
        List<String> completedDegrees = users.get(position).getCompletedDegrees();
        if (completedDegrees != null && !completedDegrees.isEmpty()) {
            for (String degree : completedDegrees) {
                TextView degreeTextView = new TextView(context);
                degreeTextView.setText(degree);
                degreeTextView.setTextSize(16);
                holder.completedDegreesContainer.addView(degreeTextView);
            }
        }
    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}
