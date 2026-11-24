# Changelog for [Hybrid Blocks](https://github.com/hybridlabs/hybrid-blocks)

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [1.4.0] 2026-11-24

- Added the blackstone blockset.
- Added the stone brick and deepslate brick blocksets.
- Added concrete walls.
- Added more chimneys.
- Added the brinestone, chimneystone and schist blocksets. These are craftable in survival when Hybrid Aquatic is installed and are also available in creative mode.
- Added more blocks to the nether brick and red nether brick blocksets.
- Wool and concrete slabs and stairs have been removed because vanilla 26.3 now has them. Existing blocks are converted to their vanilla versions.
- Changed the stone brick and deepslate brick variant textures.
- Added missing walls for some shingle blocks.
- Fixed item names in the creative inventory.
- Fixed a large number of missing crafting recipes.
- Fixed the recipe-book grouping for quartz blocks.

### Developer notes

- The blocksets are generated through the block and recipe datagen.
- The wool/concrete slab-and-stairs removal is backed by a datafix to vanilla blocks.
- Quartz recipe-book groups and creative item names were fixed in the data providers.

## [1.3.1] 2026-11-11

- Added deepslate brick blockset
- Added stone brick blockset
- Added wool blockset
- Added concrete blockset
- Added more chimneys
- Added brinestone, chimneystone, and schist blocksets. Craftable in survival when Hybrid Aquatic is installed, but still obtainable in creative mode as well
- Added more blocks to nether brick and red nether brick blocksets
- Fixed a ton of missing crafting recipes
- Fixed recipes not being grouped properly in the recipe book
- Bunch of internal organization to help streamline future updates
