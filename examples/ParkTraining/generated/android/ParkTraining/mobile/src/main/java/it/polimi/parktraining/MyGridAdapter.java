package it.polimi.parktraining;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public final class MyGridAdapter extends BaseAdapter {

	private final Activity context;
	private final int layoutId;
	private final String[] itemNames;
	private final Integer[] imgIds;

	public MyGridAdapter(Activity context, String[] itemNames) {
		this.context = context;
		this.layoutId = R.layout.my_grid_cell_simple;
		this.itemNames = itemNames;
		this.imgIds = null;
	}

	public MyGridAdapter(Activity context, Integer[] imgIds) {
		this.context = context;
		this.layoutId = R.layout.my_grid_cell_image;
		this.itemNames = null;
		this.imgIds = imgIds;
	}

	public MyGridAdapter(Activity context, String[] itemNames, Integer[] imgIds) {
		this.context = context;
		this.layoutId = R.layout.my_grid_cell_detailed;
		this.itemNames = itemNames;
		this.imgIds = imgIds;
	}

	@Override
	public int getCount() {
		if (this.layoutId == R.layout.my_grid_cell_image) {
			return this.imgIds.length;
		}
		return this.itemNames.length;
	}

	@Override
	public Object getItem(int position) {
		return null;
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = context.getLayoutInflater();
		View gridView = inflater.inflate(this.layoutId, null, true);

		if (this.layoutId == R.layout.my_grid_cell_simple) {
			TextView tv = (TextView) gridView
					.findViewById(R.id.gridview_simple_tv);
			tv.setText(itemNames[position]);
		} else if (this.layoutId == R.layout.my_grid_cell_image) {
			ImageView iv = (ImageView) gridView
					.findViewById(R.id.gridview_image_img);
			iv.setImageResource(imgIds[position]);
		} else if (this.layoutId == R.layout.my_grid_cell_detailed) {
			ImageView iv = (ImageView) gridView
					.findViewById(R.id.gridview_detailed_img);
			iv.setImageResource(imgIds[position]);
			TextView tv = (TextView) gridView
					.findViewById(R.id.gridview_detailed_tv);
			tv.setText(itemNames[position]);
		}

		return gridView;
	}
}
