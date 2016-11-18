package com.laegler.stubbr.lang.generator.tasklevel

class GitTaskGenerator {

	/**
	 * https://git-scm.com/book/be/v2/Embedding-Git-in-your-Applications-JGit
	 */
	def doPushToRemote() {
		// TODO
//		val Repository newlyCreatedRepo = FileRepositoryBuilder.create(new File("/tmp/new_repo/.git"));
//
//		// Open an existing repository
//		val Repository existingRepo = new FileRepositoryBuilder => [
//			gitDir = new File("my_repo/.git")
//		].build
//
//		// Get a reference
//		val Ref master = repo.getRef("master");
//
//		// Get the object the reference points to
//		val ObjectId masterTip = master.getObjectId();
//
//		// Rev-parse
//		val ObjectId obj = repo.resolve("HEAD^{tree}");
//
//		// Load raw object contents
//		val ObjectLoader loader = r.open(masterTip);
//		loader.copyTo(System.out);
//
//		// Create a branch
//		val RefUpdate createBranch1 = r.updateRef("refs/heads/branch1");
//		createBranch1.setNewObjectId(masterTip);
//		createBranch1.update();
//
//		// Delete a branch
//		val RefUpdate deleteBranch1 = r.updateRef("refs/heads/branch1");
//		deleteBranch1.setForceUpdate(true);
//		deleteBranch1.delete();
//
//		// Config
//		val Config cfg = r.getConfig();
//		val String name = cfg.getString("user", null, "name");
	}

}
