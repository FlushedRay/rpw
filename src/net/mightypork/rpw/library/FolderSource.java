package net.mightypork.rpw.library;


import java.io.File;

import net.mightypork.rpw.tree.assets.AssetEntry;


public class FolderSource extends Source {

	private File folder;


	public FolderSource(File base) {

		folder = base;
	}


	@Override
	public File getAssetFile(String key) {

		AssetEntry ae = Sources.vanilla.getAssetForKey(key);
		File file = new File(folder, ae.getPath());

		if (!file.exists()) return null;
		return file;
	}


	@Override
	public File getAssetsBaseDirectory() {

		return folder;
	}

}
